import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class CrudApp {
    private JFrame frame;
    private JTextField nameField;
    private JTextField ageField;
    private JTable table;
    private DefaultTableModel model;
    private ArrayList<Pessoa> people;

    public CrudApp() {
        people = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        frame = new JFrame("CRUD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Panel de entrada
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        nameField = new JTextField(10);
        ageField = new JTextField(5);
        JButton addButton = new JButton("Adicionar");
        JButton updateButton = new JButton("Atualizar");
        JButton deleteButton = new JButton("Apagar");

        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Idade:"));
        inputPanel.add(ageField);
        inputPanel.add(addButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        // Tabla
        model = new DefaultTableModel(new String[]{"Nome", "Idade"}, 0);
        table = new JTable(model);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        // Acciones de botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPessoa();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePerson();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletePerson();
            }
        });

        frame.setVisible(true);
    }

    private void addPessoa() {
        String nome = nameField.getText();
        String idade = ageField.getText();
        if (!nome.isEmpty() && !idade.isEmpty()) {
            people.add(new Pessoa(nome, Integer.parseInt(idade)));
            model.addRow(new Object[]{nome, idade});
            clearFields();
        } else {
            JOptionPane.showMessageDialog(frame, "Por favor, complete todos os campos.");
        }
    }

    private void updatePerson() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String nome = nameField.getText();
            String idade = ageField.getText();
            if (!nome.isEmpty() && !idade.isEmpty()) {
                people.get(selectedRow).setNome(nome);
                people.get(selectedRow).setIdade(Integer.parseInt(idade));
                model.setValueAt(nome, selectedRow, 0);
                model.setValueAt(idade, selectedRow, 1);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(frame, "Por favor, complete todos os campos.");
            }
        }
    }

    private void deletePerson() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            people.remove(selectedRow);
            model.removeRow(selectedRow);
            clearFields();
        }
    }

    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CrudApp::new);
    }

    class Pessoa {
        private String nome;
        private int idade;

        public Pessoa (String nome, int pessoa) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }
}

