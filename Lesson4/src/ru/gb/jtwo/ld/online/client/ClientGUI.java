package ru.gb.jtwo.ld.online.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Date;

public class ClientGUI extends JFrame implements ActionListener, Thread.UncaughtExceptionHandler {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JTextArea log = new JTextArea();
    private final JPanel panelTop = new JPanel(new GridLayout(2, 3));
    private final JTextField tfIPAddress = new JTextField("127.0.0.1");
    private final JTextField tfPort = new JTextField("8189");
    private final JCheckBox cbAlwaysOnTop = new JCheckBox("Always on top");
    private final JTextField tfLogin = new JTextField("User");
    private final JPasswordField tfPassword = new JPasswordField("123");
    private final JButton btnLogin = new JButton("Login");
    private final JPanel panelBottom = new JPanel(new BorderLayout());
    private final JButton btnDisconnect = new JButton("<html><b>Disconnect</b></html>");
    private final JTextField tfMessage = new JTextField();
    private final JButton btnSend = new JButton("Send");
    private final JList<String> userList = new JList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientGUI();
            }
        });
    }
    private static final String filename = "file.txt";
   private static final File file = new File("C:\\Learning IT\\Java\\JavaLvl2\\Lesson4\\src\\ru\\gb\\jtwo\\ld\\online\\client\\file.txt");

    private ClientGUI() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(WIDTH, HEIGHT);
        setTitle("Chat client");
        String[] users = {"user1", "user2", "user3", "user4", "user5",
                "user_with_an_exceptionally_long_name_in_this_chat"};
        userList.setListData(users);
        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        JScrollPane scrollUsers = new JScrollPane(userList);
        scrollUsers.setPreferredSize(new Dimension(100, 0));
        cbAlwaysOnTop.addActionListener(this);
        panelTop.add(tfIPAddress);
        panelTop.add(tfPort);
        panelTop.add(cbAlwaysOnTop);
        panelTop.add(tfLogin);
        panelTop.add(tfPassword);
        panelTop.add(btnLogin);
        panelBottom.add(btnDisconnect, BorderLayout.WEST);
        panelBottom.add(tfMessage, BorderLayout.CENTER);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buffer;
                int i = 0;
                buffer = tfMessage.getText();
                log.insert(new Date(new Date().getTime()) + " : " + tfLogin.getText() + " write : "+ buffer + "\n", i);
                try {
 /*                   PrintWriter printWriter = new PrintWriter("file.txt");
                    printWriter.println(buffer);
                    printWriter.flush();
                    printWriter.close();*/
                        BufferedWriter fis = new BufferedWriter(new FileWriter(file, true));
                        fis.write(new Date(new Date().getTime())  + " : " + tfLogin.getText() + " write : "+ buffer + "\n");
                        fis.flush();
                        fis.close();
                }catch (FileNotFoundException ex){
                    ex.printStackTrace();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
                i++;
                tfMessage.removeAll(); // ?? why doesn't erase nothing?;

            //    buffer = "";
            }
        } ;
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String buffer;
                    int i = 0;
                    buffer = tfMessage.getText();
                    log.insert( new Date(new Date().getTime())  + " : " + tfLogin.getText() + " write : "+ buffer + "\n", i);
                    try {
                        PrintWriter printWriter = new PrintWriter("file.txt");
                        printWriter.println(new Date(new Date().getTime())  + " : " + tfLogin.getText() + " write : " + buffer + "\n");
                        printWriter.flush();
                        printWriter.close();
                     /*   BufferedWriter fis = new BufferedWriter(new FileWriter(new File(filename), true));
                        fis.write(buffer);
                        fis.flush();
                        fis.close();*/
                    }catch (FileNotFoundException ex){
                        ex.printStackTrace();
                    }catch (IOException ex){
                        ex.printStackTrace();
                    }
                    i++;
                    tfMessage.removeAll(); // ?? why doesn't erase nothing?;
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {

                }
            };
        btnSend.addActionListener(actionListener);
        btnSend.getRootPane().addKeyListener(keyListener); // Why? why it isn't working???;
     //   btnSend.addKeyListener(keyListener);       //this was stupid, I guess;
        panelBottom.add(btnSend, BorderLayout.EAST);
     //   panelBottom.getRootPane().setDefaultButton(btnSend);      // where Frame which will listen keyboard?;
        add(scrollLog, BorderLayout.CENTER);
        add(scrollUsers, BorderLayout.EAST);
        add(panelTop, BorderLayout.NORTH);
        add(panelBottom, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == cbAlwaysOnTop) {
            setAlwaysOnTop(cbAlwaysOnTop.isSelected());
        }
        else
            throw new RuntimeException("Unknown source: " + src);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        e.printStackTrace();
        String msg;
        StackTraceElement[] ste = e.getStackTrace();
        msg = "Exception in thread " + t.getName() + " " +
                e.getClass().getCanonicalName() + ": " +
                e.getMessage() + "\n\t" + ste[0];
        JOptionPane.showMessageDialog(null, msg, "Exception", JOptionPane.ERROR_MESSAGE);
        System.exit(1);
    }
}
