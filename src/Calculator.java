import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;


public class Calculator extends JFrame {
    //各種ボタンなどを定義
    private JPanel panel1;
    private JButton Greenbtn;
    private JButton Yellowbtn;
    private JButton btnWaru;
    private JButton btnX;
    private JButton btnSub;
    private JButton btnAdd;
    private JButton Redbtn;
    private JButton btnDate;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnEqu;
    private JButton btndot;
    private JButton btn2;
    private JButton btn5;
    private JButton btn8;
    private JButton Msub;
    private JButton Blutbtn;
    private JButton Madd;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JButton btn00;
    private JButton btn0;
    private JButton btnC;
    private JButton btnAC;
    private JButton MR;
    private JButton Warukachi;
    private JLabel fullLabel;
    private JLabel status;
    private JLabel CalcuName;
    private JButton MC;
    private JLabel MRlavel;
    private JButton bbbbb;
    private JLabel DateLavel;
    private JLabel BlueLabel;
    private JLabel RedLabel;
    private JLabel GreenLabel;
    private JLabel YellowLabel;
    private JTextArea TextArea;
    private JLabel Desigh;
    public int flag = 0;
    public String zensha = "0";
    public boolean hukusu = false;
    public boolean maesub = false;
    public String memory = "0";

    //必要最低限の表示
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    public Calculator() {
        //初期化
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 620, 840);
        setContentPane(panel1);
        //今回は電卓に加えて、カチカチ君を実装した。何か点数計算において電卓とカチカチ君が別々で紛らわしいという問題から、
        //javaのswing GUIで実装した。
        //https://kamatomo-nomadlife.com/katikatikun/
        setTitle("caosio A-0 電卓勝ち勝ちくん");

        btn1.addActionListener(new ActionListener() {
            //数字のボタン動作
            //このボタンの入力前に他の数字が入力されていた場合は文字列後方に追加し
            //そうでなければ1を表示させる。
            //1を表示させた場合において、入力のbooleanをtrueにする。
            //以下、数字のボタンは同様の動作である。
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("1");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("1");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("1");
                    hukusu = true;
                } else {
                    String add = tmp.concat("1");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("2");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("2");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("2");
                    hukusu = true;
                } else {
                    String add = tmp.concat("2");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("3");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("3");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("3");
                    hukusu = true;
                } else {
                    String add = tmp.concat("3");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("4");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("4");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("4");
                    hukusu = true;
                } else {
                    String add = tmp.concat("4");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("5");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("5");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("5");
                    hukusu = true;
                } else {
                    String add = tmp.concat("5");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("6");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("6");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("6");
                    hukusu = true;
                } else {
                    String add = tmp.concat("6");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("7");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("7");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("7");
                    hukusu = true;
                } else {
                    String add = tmp.concat("7");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("8");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("8");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("8");
                    hukusu = true;
                } else {
                    String add = tmp.concat("8");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("9");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = tmp.concat("9");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("9");
                    hukusu = true;
                } else {
                    String add = tmp.concat("9");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tmp = fullLabel.getText();
                if (flag >= 1 && fullLabel.getText().equals("0")) {
                    fullLabel.setText("0");
                    flag++;
                } else if (flag >= 1) {
                    String add = tmp.concat("0");
                    fullLabel.setText(add);
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("0");
                } else {
                    String add = tmp.concat("0");
                    fullLabel.setText(add);
                }
            }
        });
        btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = fullLabel.getText();
                if (flag >= 1 && fullLabel.getText().equals("0")) {
                    fullLabel.setText("0");
                    flag++;
                } else if (flag >= 1) {
                    String add = tmp.concat("00");
                    fullLabel.setText(add);
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("0");
                } else {
                    String add = tmp.concat("00");
                    fullLabel.setText(add);
                }
            }
        });
        //Cを押した場合によって動作するイベント
        //表示だけを初期化
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fullLabel.setText("0");
            }
        });
        //イコールにおけるイベント
        //前に入力した演算子に対応させてそれぞれ演算し、結果表示させる。
        btnEqu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (status.getText().equals("+") && flag == 1) {
                    status.setText("=");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.add(num1)));
                    zensha = String.valueOf(num2.add(num1));
                    hukusu = false;
                } else if (status.getText().equals("-") && flag == 1) {
                    status.setText("=");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.subtract(num1)));
                    zensha = String.valueOf(num2.subtract(num1));
                    hukusu = false;
                } else if (status.getText().equals("×") && flag == 1) {
                    status.setText("=");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.multiply(num1)));
                    zensha = String.valueOf(num2.multiply(num1));
                    hukusu = false;
                } else if (status.getText().equals("÷") && flag == 1) {
                    status.setText("=");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP)));
                    zensha = String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP));
                    hukusu = false;
                }
            }
        });
        //足し算におけるイベント
        //前に演算子をクリックしていない場合はその演算子をstatusに保持しておき、flagを1にする。
        //している場合は対応した演算子を演算してからstatusに+を切り替えている。
        //その他の演算子も同様な処理であるため割愛。
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    status.setText("+");
                    zensha = fullLabel.getText();
                    hukusu = false;
                    flag++;
                } else if (flag == 1 && status.getText().equals("+")) {
                    status.setText("+");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.add(num1)));
                    zensha = String.valueOf(num2.add(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("-")) {
                    status.setText("+");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.subtract(num1)));
                    zensha = String.valueOf(num2.subtract(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("×")) {
                    status.setText("+");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.multiply(num1)));
                    zensha = String.valueOf(num2.multiply(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("÷")) {
                    status.setText("+");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP)));
                    zensha = String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP));
                    hukusu = false;
                } else {
                    status.setText("+");
                    zensha = fullLabel.getText();
                    hukusu = false;
                }
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    status.setText("-");
                    zensha = fullLabel.getText();
                    hukusu = false;
                    flag++;
                } else if (flag == 1 && status.getText().equals("+")) {
                    status.setText("-");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.add(num1)));
                    zensha = String.valueOf(num2.add(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("-")) {
                    status.setText("-");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.subtract(num1)));
                    zensha = String.valueOf(num2.subtract(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("×")) {
                    status.setText("-");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.multiply(num1)));
                    zensha = String.valueOf(num2.multiply(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("÷")) {
                    status.setText("-");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP)));
                    zensha = String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP));
                    hukusu = false;
                } else {
                    status.setText("-");
                    zensha = fullLabel.getText();
                    hukusu = false;
                }

            }
        });
        btnX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (flag == 0) {
                    status.setText("×");
                    zensha = fullLabel.getText();
                    hukusu = false;
                    flag++;
                } else if (flag == 1 && status.getText().equals("+")) {
                    status.setText("×");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.add(num1)));
                    zensha = String.valueOf(num2.add(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("-")) {
                    status.setText("×");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.subtract(num1)));
                    zensha = String.valueOf(num2.subtract(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("×")) {
                    status.setText("×");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.multiply(num1)));
                    zensha = String.valueOf(num2.multiply(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("÷")) {
                    status.setText("×");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP)));
                    zensha = String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP));
                    hukusu = false;
                } else {
                    status.setText("×");
                    zensha = fullLabel.getText();
                    hukusu = false;
                }
            }
        });
        btnWaru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (flag == 0) {
                    status.setText("÷");
                    zensha = fullLabel.getText();
                    hukusu = false;
                    flag++;
                } else if (flag == 1 && status.getText().equals("+")) {
                    status.setText("÷");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.add(num1)));
                    zensha = String.valueOf(num2.add(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("-")) {
                    status.setText("÷");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.subtract(num1)));
                    zensha = String.valueOf(num2.subtract(num1));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("×")) {
                    status.setText("÷");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num1.multiply(num2)));
                    zensha = String.valueOf(num1.multiply(num2));
                    hukusu = false;
                } else if (flag == 1 && status.getText().equals("÷")) {
                    status.setText("÷");
                    BigDecimal num1 = new BigDecimal(fullLabel.getText());
                    BigDecimal num2 = new BigDecimal(zensha);
                    fullLabel.setText(String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP)));
                    zensha = String.valueOf(num2.divide(num1, 1, BigDecimal.ROUND_HALF_UP));
                    hukusu = false;
                } else {
                    status.setText("÷");
                    zensha = fullLabel.getText();
                    hukusu = false;
                }
            }
        });
        //全ての値を初期化する。
        //カチカチ君は例外とする。（使い勝手重視)
        btnAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 0;
                zensha = "0";
                fullLabel.setText("0");
                status.setText("　");
                memory = "0";
                MRlavel.setText("");
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fullLabel.setText("0");
            }
        });
        //.における処理。
        //数字と扱いはほぼ変わらない。
        btndot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 1 && hukusu == false) {
                    fullLabel.setText("0.");
                    hukusu = true;
                } else if (flag == 1 && hukusu == true) {
                    String add = fullLabel.getText().concat(".");
                    fullLabel.setText(add);
                    hukusu = true;
                } else if (fullLabel.getText().equals("0")) {
                    fullLabel.setText("0.");
                    hukusu = true;
                } else {
                    String add = fullLabel.getText().concat(".");
                    fullLabel.setText(add);
                    hukusu = true;
                }
            }
        });
        //メモリー部分　これはM+で動作する
        Madd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BigDecimal num1 = new BigDecimal(fullLabel.getText());
                BigDecimal num2 = new BigDecimal(memory);
                memory = String.valueOf(num2.add(num1));
                MRlavel.setText("MR:" + memory);
            }
        });
        //メモリー部分　これはM-で動作する
        Msub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BigDecimal num1 = new BigDecimal(fullLabel.getText());
                BigDecimal num2 = new BigDecimal(memory);
                memory = String.valueOf(num2.subtract(num1));
                MRlavel.setText("MR:" + memory);
            }
        });
        //メモリー部分　これはMCで動作する
        MC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memory = "0";
                MRlavel.setText(memory);
            }
        });
        //メモリー部分　これはMRで動作する
        MR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MRlavel.setText("MR:" + memory);
            }
        });
        //DateLabelにdateを表示させる。パチスロの世界において、時間は重要であるため導入した。
        btnDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DateLavel.setText(String.valueOf(ZonedDateTime.now()));
            }
        });
        //青はチャンス目、赤はチェリー、緑はスイカ、黄色はベルに対応できるカチカチ君の機能
        //これはカウンタ処理。
        Blutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tmp = Integer.parseInt(BlueLabel.getText());
                tmp++;
                BlueLabel.setText(String.valueOf(tmp));
            }
        });
        Redbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tmp = Integer.parseInt(RedLabel.getText());
                tmp++;
                RedLabel.setText(String.valueOf(tmp));
            }
        });
        Greenbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tmp = Integer.parseInt(GreenLabel.getText());
                tmp++;
                GreenLabel.setText(String.valueOf(tmp));
            }
        });
        Yellowbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tmp = Integer.parseInt(YellowLabel.getText());
                tmp++;
                YellowLabel.setText(String.valueOf(tmp));
            }
        });
        //カチカチ君初期化
        bbbbb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                YellowLabel.setText(String.valueOf(0));
                GreenLabel.setText(String.valueOf(0));
                RedLabel.setText(String.valueOf(0));
                BlueLabel.setText(String.valueOf(0));
                DateLavel.setText(" ");
                TextArea.setText("0");
            }
        });
        //これによってボーナス確率を計算
        Warukachi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextArea.getText().equals("0")) {
                    DateLavel.setText("何ゲームをしたのかをテキストフィールドに入力してください。");
                } else if (TextArea.getText().equals("")) {
                    DateLavel.setText("何ゲームをしたのかをテキストフィールドに入力してください。");
                } else {
                    double allgame = Double.parseDouble(TextArea.getText());
                    double tmpBlue = Double.parseDouble(BlueLabel.getText());
                    double tmpRed = Double.parseDouble(RedLabel.getText());
                    double tmpGreen = Double.parseDouble(GreenLabel.getText());
                    double tmpYellow = Double.parseDouble(YellowLabel.getText());
                    DateLavel.setText("青:" + Math.floor(allgame / tmpBlue) + "　赤:" + Math.floor(allgame / tmpRed) + "　緑:" + Math.floor(allgame / tmpGreen) + "　黄:" + Math.floor(allgame / tmpYellow));
                }
            }
        });
    }
}
