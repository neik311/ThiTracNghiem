/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;
import java.awt.Color;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import function.fileData;
import function.varData;
import user.userProfile;
import history.history;

public class startExam extends javax.swing.JFrame{

    public static int page ;
    public static int qsLength = 158;
    public static varData de;
    public static int[] result = new int[26];
    public static setTime startTime;
    public static boolean checkSubmit =false;
    public static int timeNow;
    public void setPanelImg(){
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        panelImg = new javax.swing.JPanel();
        qs6 = new javax.swing.JLabel();
        option6A = new javax.swing.JRadioButton();
        option6C = new javax.swing.JRadioButton();
        option6B = new javax.swing.JRadioButton();
        option6D = new javax.swing.JRadioButton();
        qs7 = new javax.swing.JLabel();
        option7A = new javax.swing.JRadioButton();
        option7B = new javax.swing.JRadioButton();
        option7D = new javax.swing.JRadioButton();
        option7C = new javax.swing.JRadioButton();
        img6 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        panelImg.setVisible(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        qs6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qs6.setText("jLabel3");

        buttonGroup7.add(option6A);
        option6A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup7.add(option6C);
        option6C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup7.add(option6B);
        option6B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup7.add(option6D);
        option6D.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        qs7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qs7.setText("jLabel4");

        buttonGroup8.add(option7A);
        option7A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup8.add(option7B);
        option7B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup8.add(option7D);
        option7D.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup8.add(option7C);
        option7C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        img6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img_notice/168.png"))); // NOI18N

        img7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img_notice/168.png"))); // NOI18N

        javax.swing.GroupLayout panelImgLayout = new javax.swing.GroupLayout(panelImg);
        panelImg.setLayout(panelImgLayout);
        panelImgLayout.setHorizontalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImgLayout.createSequentialGroup()
                .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(qs6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelImgLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option7B)
                                    .addComponent(option7A)
                                    .addComponent(option7C)
                                    .addComponent(option7D))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(img7, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImgLayout.createSequentialGroup()
                                .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option6D)
                                    .addComponent(option6C)
                                    .addComponent(option6A)
                                    .addComponent(option6B))
                                .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelImgLayout.createSequentialGroup()
                                        .addGap(216, 216, 216)
                                        .addGap(557, 557, 557))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(img6, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(2, 2, 2))
            .addGroup(panelImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qs7, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImgLayout.setVerticalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImgLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(qs6)
                .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(img6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelImgLayout.createSequentialGroup()
                        .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImgLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(option6A)
                                .addGap(34, 34, 34)
                                .addComponent(option6B)
                                .addGap(33, 33, 33)
                                .addComponent(option6C)
                                .addGap(34, 34, 34)
                                .addComponent(option6D)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(qs7)
                .addGroup(panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImgLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(option7A)
                        .addGap(32, 32, 32)
                        .addComponent(option7B)
                        .addGap(33, 33, 33)
                        .addComponent(option7C)
                        .addGap(35, 35, 35)
                        .addComponent(option7D))
                    .addGroup(panelImgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(img7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(panelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
    }
    public void khoiTao() throws IOException{
        ImageIcon icon;
        icon = new ImageIcon("src/data/img_avatar/avatar"+ String.valueOf(fileData.readAvatar()) +".png");
        avatar.setIcon(icon);
        qs1H2.setFont(new java.awt.Font("Tahoma", 1, 12));
        qs2H2.setFont(new java.awt.Font("Tahoma", 1, 12));
        qs3H2.setFont(new java.awt.Font("Tahoma", 1, 12));
        qs4H2.setFont(new java.awt.Font("Tahoma", 1, 12));
        qs5H2.setFont(new java.awt.Font("Tahoma", 1, 12));
        javax.swing.ButtonGroup[] group1 ={buttonGroup1,buttonGroup2,buttonGroup3,buttonGroup4,buttonGroup5,buttonGroup6,buttonGroup7,buttonGroup8};
        for(int i=0;i<8;i++){
                group1[i].clearSelection();
            }
        page =1;
        page1.setSelected(true);
        de = new varData();
        fileData.setDe(de);
        fileData.setDe2(de,15,20);
        fileData.setDe2(de,20,25);
    //    de.id[23] ="173";
    //    de.id[24] = "194";
        for(int i=0;i<26;i++){
            result[i] =0;
        }
        checkSubmit = false;
        String s ="";
        s =fileData.checkUserLogin();
        if(s!=null){
            if(s.length() >=3)
                      avatar.setText(s);
         }
    }
    public void saveResult(){
        if(page >=1 && page<=3){
            javax.swing.JRadioButton[] option = {option1A,option1B,option1C,option2A,option2B,option2C,option3A,option3B,option3C,
                                                 option4A,option4B,option4C,option5A,option5B,option5C};
            int x =0;
            for(int i=0;i<5;i++){
                if(option[x].isSelected() ==true)
                    result[(page-1)*5+i] = 1;
                else if(option[x+1].isSelected() ==true)
                    result[(page-1)*5+i] = 2;
                else if(option[x+2].isSelected() ==true)
                    result[(page-1)*5+i] = 3;
                x =x +3;
            }
        }
        else if(page >=4 && page <=8){
            javax.swing.JRadioButton[] option2 = {option6A,option6B,option6C,option6D,option7A,option7B,option7C,option7D};
            int x =0;
            for(int i=0;i<2;i++){
                if(option2[x].isSelected() ==true)
                    result[15+(page-4)*2+i] = 1;
                else if(option2[x+1].isSelected() ==true)
                    result[15+(page-4)*2+i] = 2;
                else if(option2[x+2].isSelected() ==true)
                    result[15+(page-4)*2+i] = 3;
                else if(option2[x+3].isSelected() ==true)
                    result[15+(page-4)*2+i] = 4;
                x =x +4;
            }
        }
    }
    public void dataDethi2() throws IOException{
        if(page!=1)
            page1.setSelected(false);
        javax.swing.JLabel[] qs = {qs6,qs7};
        javax.swing.JLabel[] img = {img6,img7};
        javax.swing.JRadioButton[] option = {option6A,option6B,option6C,option6D,option7A,option7B,option7C,option7D};
        javax.swing.ButtonGroup[] group ={buttonGroup7,buttonGroup8};
        for(int i=0;i<2;i++){
            group[i].clearSelection();
        }
        for(int x =0;x<8;x++){
            option[x].setForeground(new java.awt.Color(0,0,0));
        }
        if(checkSubmit ==true){
           for(int i=0;i<2;i++){
               int da = de.dapAn[15+(page-4)*2+i];
               option[i*4+da-1].setForeground(new java.awt.Color(0, 153, 153));
           }
        }
        int stt =0 ,stt2 =0;
        for(int i=15+(page-4)*2;i<15+(page-3)*2;i++){
            ImageIcon icon;
            icon = new ImageIcon("src/data/img_notice/"+de.id[i]+".png");
            img[stt].setIcon(icon);
            qs[stt].setText("Câu "+String.valueOf(i+1) + " : " +de.cauHoi[i]+" ");
            if(i>=20){
                option[stt2+2].setVisible(true);
                option[stt2+3].setVisible(true);
                if(de.cauC[i].equals("Null")==true){
                    option[stt2+2].setVisible(false);
                }  
                if(de.cauD[i].equals("Null")==true){
                    option[stt2+3].setVisible(false);
                }
            }
            if(result[i]==1)
                option[stt2].setSelected(true);
            else if(result[i]==2)
                option[stt2+1].setSelected(true);
            else if(result[i]==3)
                option[stt2+2].setSelected(true);
            else if(result[i]==4)
                option[stt2+3].setSelected(true);
            option[stt2].setText("A. "+de.cauA[i]);
            option[stt2+1].setText("B. " +de.cauB[i]);
            option[stt2+2].setText("C. "+de.cauC[i]);
            option[stt2+3].setText("D. "+de.cauD[i]);
            stt++;
            stt2 = stt2 +4;
        }
    }
    public void dataDethi() throws IOException{
        if(page!=1)
            page1.setSelected(false);
        javax.swing.JLabel[] qs = {qs1H1,qs1H2,qs2H1,qs2H2,qs3H1,qs3H2,qs4H1,qs4H2,qs5H1,qs5H2};
        javax.swing.JRadioButton[] option = {option1A,option1B,option1C,option2A,option2B,option2C,option3A,option3B,option3C,
                                             option4A,option4B,option4C,option5A,option5B,option5C};
         javax.swing.ButtonGroup[] group1 ={buttonGroup1,buttonGroup2,buttonGroup3,buttonGroup4,buttonGroup5};
        for(int i=0;i<5;i++){
            group1[i].clearSelection();
        }
        for(int x =0;x<15;x++){
            option[x].setForeground(new java.awt.Color(0,0,0));
        }
        if(checkSubmit ==true){
           for(int i=0;i<5;i++){
               int da = de.dapAn[(page-1)*5+i];
               option[i*3+da-1].setForeground(new java.awt.Color(0, 153, 153));
           }
        }
        for(int i=0;i<10;i++){
            qs[i].setText("");
        }
        int stt =0 ,stt2 =0;
        for(int i=(page-1)*5;i<(page)*5;i++){
            if(de.cauHoi[i].length() <qsLength){
                qs[stt].setText("Câu "+String.valueOf(i+1) + " : " +de.cauHoi[i]+" ");
            }
            else{
                String s =de.cauHoi[i], s1 ="" , s2 ="";
                int vt = qsLength;
                while(s.charAt(vt) != ' '){
                    vt--;
                }
                for(int j=0;j<=vt;j++)
                    s1 = s1 + s.charAt(j);
                for(int j=vt+1;j<s.length();j++)
                    s2 = s2 + s.charAt(j);
                qs[stt].setText("Câu "+String.valueOf(i+1) + " : " +s1);
                qs[stt+1].setText(s2);
            }
            if(result[i]==1)
                option[stt2].setSelected(true);
            else if(result[i]==2)
                option[stt2+1].setSelected(true);
            else if(result[i]==3)
                option[stt2+2].setSelected(true);
            option[stt2].setText("A. "+de.cauA[i]);
            option[stt2+1].setText("B. " +de.cauB[i]);
            option[stt2+2].setText("C. "+de.cauC[i]);
            stt =stt +2;
            stt2 = stt2 +3;
        }
    //   System.out.println(s);
    }
    public startExam(){
        initComponents();
        setPanelImg();
        java.time.LocalDateTime tm = java.time.LocalDateTime.now();
        timeNow = tm.getDayOfYear()*24+ tm.getHour()*60+ tm.getMinute()*60+tm.getSecond();
        try {
            khoiTao();
            dataDethi();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        setLocationRelativeTo(null);
        startTime = new setTime();
        Thread thread1 = new Thread(startTime);
        Arrays.asList(thread1).parallelStream().forEach(Thread::start);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        user = new javax.swing.JButton();
        history = new javax.swing.JButton();
        page1 = new javax.swing.JRadioButton();
        page2 = new javax.swing.JRadioButton();
        page3 = new javax.swing.JRadioButton();
        page4 = new javax.swing.JRadioButton();
        page5 = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        panelText = new javax.swing.JPanel();
        qs1H1 = new javax.swing.JLabel();
        qs3H1 = new javax.swing.JLabel();
        qs2H1 = new javax.swing.JLabel();
        qs4H1 = new javax.swing.JLabel();
        qs5H1 = new javax.swing.JLabel();
        qs1H2 = new javax.swing.JLabel();
        qs2H2 = new javax.swing.JLabel();
        qs3H2 = new javax.swing.JLabel();
        qs4H2 = new javax.swing.JLabel();
        qs5H2 = new javax.swing.JLabel();
        option1A = new javax.swing.JRadioButton();
        option1C = new javax.swing.JRadioButton();
        option1B = new javax.swing.JRadioButton();
        option2A = new javax.swing.JRadioButton();
        option2B = new javax.swing.JRadioButton();
        option2C = new javax.swing.JRadioButton();
        option3A = new javax.swing.JRadioButton();
        option3B = new javax.swing.JRadioButton();
        option3C = new javax.swing.JRadioButton();
        option4A = new javax.swing.JRadioButton();
        option4B = new javax.swing.JRadioButton();
        option4C = new javax.swing.JRadioButton();
        option5A = new javax.swing.JRadioButton();
        option5B = new javax.swing.JRadioButton();
        option5C = new javax.swing.JRadioButton();
        page6 = new javax.swing.JRadioButton();
        page7 = new javax.swing.JRadioButton();
        page8 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm thi thử lý thuyết bằng lái xe hạng A1");

        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img_avatar/avatar1.png"))); // NOI18N
        avatar.setText("no_name");
        avatar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        start.setBackground(new java.awt.Color(153, 153, 255));
        start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        start.setText("Bắt đầu");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.setText("Người dùng");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        history.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        history.setText("Lịch sử");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        buttonGroup6.add(page1);
        page1.setText("1");
        page1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page1ActionPerformed(evt);
            }
        });

        buttonGroup6.add(page2);
        page2.setText("2");
        page2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2ActionPerformed(evt);
            }
        });

        buttonGroup6.add(page3);
        page3.setText("3");
        page3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page3ActionPerformed(evt);
            }
        });

        buttonGroup6.add(page4);
        page4.setText("4");
        page4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page4ActionPerformed(evt);
            }
        });

        buttonGroup6.add(page5);
        page5.setText("5");
        page5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page5ActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setText("Nộp bài");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        qs1H1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qs1H1.setText("Cau");

        qs3H1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qs3H1.setText("Cau");

        qs2H1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qs2H1.setText("Cau");

        qs4H1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qs4H1.setText("Cau");

        qs5H1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qs5H1.setText("Cau");

        qs1H2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        qs2H2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        qs3H2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        qs4H2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        qs5H2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGroup1.add(option1A);
        option1A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup1.add(option1C);
        option1C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup1.add(option1B);
        option1B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup2.add(option2A);
        option2A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup2.add(option2B);
        option2B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup2.add(option2C);
        option2C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        option2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2CActionPerformed(evt);
            }
        });

        buttonGroup3.add(option3A);
        option3A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup3.add(option3B);
        option3B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup3.add(option3C);
        option3C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup4.add(option4A);
        option4A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup4.add(option4B);
        option4B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup4.add(option4C);
        option4C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup5.add(option5A);
        option5A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup5.add(option5B);
        option5B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup5.add(option5C);
        option5C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelTextLayout = new javax.swing.GroupLayout(panelText);
        panelText.setLayout(panelTextLayout);
        panelTextLayout.setHorizontalGroup(
            panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextLayout.createSequentialGroup()
                .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTextLayout.createSequentialGroup()
                        .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTextLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option2C)
                                    .addComponent(option2B)
                                    .addComponent(option2A)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTextLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option3B)
                                    .addComponent(option3A)
                                    .addComponent(option3C)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTextLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option4C)
                                    .addComponent(option4B)
                                    .addComponent(option4A)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTextLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option5B)
                                    .addComponent(option5A)
                                    .addComponent(option5C))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTextLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qs5H2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qs2H1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qs4H1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qs5H1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qs1H1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qs1H2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qs2H2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelTextLayout.createSequentialGroup()
                                .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelTextLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(option1C)
                                            .addComponent(option1A)
                                            .addComponent(option1B)))
                                    .addComponent(qs3H1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(qs3H2, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                                    .addComponent(qs4H2, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 11, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelTextLayout.setVerticalGroup(
            panelTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(qs1H1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qs1H2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option1A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option1B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option1C)
                .addGap(18, 18, 18)
                .addComponent(qs2H1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qs2H2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option2A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option2B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option2C)
                .addGap(18, 18, 18)
                .addComponent(qs3H1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qs3H2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option3A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option3B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option3C)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(qs4H1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qs4H2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(option4A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option4B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option4C)
                .addGap(18, 18, 18)
                .addComponent(qs5H1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qs5H2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option5A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option5B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option5C)
                .addGap(16, 16, 16))
        );

        buttonGroup6.add(page6);
        page6.setText("6");
        page6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page6ActionPerformed(evt);
            }
        });

        buttonGroup6.add(page7);
        page7.setText("7");
        page7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page7ActionPerformed(evt);
            }
        });

        buttonGroup6.add(page8);
        page8.setText("8");
        page8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(panelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(page1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(page1)
                            .addComponent(page2)
                            .addComponent(page3)
                            .addComponent(page4)
                            .addComponent(page5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(page6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(page7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(page8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void page5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page5ActionPerformed
       saveResult();
       if(page >=1 && page<=3){
            panelText.setVisible(false);
            panelImg.setVisible(true);
        }
        page =5;
        try {
            dataDethi2();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_page5ActionPerformed

    private void page1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page1ActionPerformed
        // TODO add your handling code here:
        saveResult();
        if(page >=4 && page<=8){
            panelImg.setVisible(false);
            panelText.setVisible(true);
        }
        page =1;
        try {
            dataDethi();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page1ActionPerformed

    private void page3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page3ActionPerformed
        // TODO add your handling code here:
        saveResult();
        if(page >=4 && page<=8){
            panelImg.setVisible(false);
            panelText.setVisible(true);
        }
        page =3;
        try {
            dataDethi();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page3ActionPerformed

    private void page4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page4ActionPerformed
        saveResult();
        
        if(page >=1 && page<=3){
            panelText.setVisible(false);
             panelImg.setVisible(true);
        }
        page =4;
        try {
            dataDethi2();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_page4ActionPerformed

    private void page2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page2ActionPerformed
        saveResult();
        if(page >=4 && page<=8){
            panelImg.setVisible(false);
            panelText.setVisible(true);
        }
        page =2;
     //   buttonGroup1.clearSelection();
   //     System.out.println(option1A.getActionCommand());
        try {
            dataDethi();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page2ActionPerformed

    private void option2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option2CActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
      
    }//GEN-LAST:event_startActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        if(checkSubmit ==false)
            new waring2().setVisible(true);
        else{
            try {
                new userProfile().setVisible(true);
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_userActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        if(checkSubmit ==false)
          new waring2().setVisible(true);
        else{
            new history().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_historyActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(checkSubmit ==false){
            checkSubmit = true;
            submit.setText("Quay lại");
            saveResult();
             if(page>=1 && page <=3)
                try {
                    dataDethi();
                } catch (IOException ex) {
                Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
                }
            else if(page>=4 && page <=8){
                try {
                    dataDethi2();
                } catch (IOException ex) {
                    Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            java.time.LocalDateTime tm = java.time.LocalDateTime.now();
            int time = tm.getDayOfYear()*24+ tm.getHour()*60+ tm.getMinute()*60+tm.getSecond();
            time = time - timeNow;
            String st =""; 
            st =st + String.valueOf(tm.getHour())+":"+String.valueOf(tm.getMinute())+" - " +String.valueOf(tm.getDayOfMonth())+"/" 
                    +String.valueOf(tm.getMonthValue())+"/" + String.valueOf(tm.getYear());
            int dem=0;
            for(int i=0;i<25;i++){
                if(result[i] == de.dapAn[i]){
                    dem++;
                }
            }
        //    System.out.println("ban da lam dung : "+ dem);
            startTime.dispose();
            try {
                String sx ="";
                int i =19;
                sx = fileData.readSetTime();
                if(sx!= null){
                  if(sx.length() >0)
                    i = Integer.parseInt(sx);
                }
                if(time <=i*60){
                    fileData.addHistory(avatar.getText(),dem,time,st);
                    fileData.addAnswer(de,dem,time,"yes");
                }
                else{
                    fileData.addAnswer(de,dem,time,"no");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
            }
           new answer().setVisible(true);
        }
        else{
            try {
                new startTest().setVisible(true);
                khoiTao();
                dataDethi();
            } catch (IOException ex) {
                Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
            }
            startTime.dispose();
            this.dispose();
        }
    }//GEN-LAST:event_submitActionPerformed

    private void page6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page6ActionPerformed
        saveResult();
        if(page >=1 && page<=3){
            panelText.setVisible(false);
             panelImg.setVisible(true);
        }
        page =6;
        try {
            dataDethi2();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page6ActionPerformed

    private void page7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page7ActionPerformed
        saveResult();
        if(page >=1 && page<=3){
            panelText.setVisible(false);
             panelImg.setVisible(true);
        }
        page =7;
        try {
            dataDethi2();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page7ActionPerformed

    private void page8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page8ActionPerformed
        saveResult();
        if(page >=1 && page<=3){
            panelText.setVisible(false);
             panelImg.setVisible(true);
        }
        page =8;
        try {
            dataDethi2();
        } catch (IOException ex) {
            Logger.getLogger(startExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()  {
            @Override
            public void run() {
                new startExam().setVisible(true);
            }
        });
//         new startExam();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JButton history;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton option1A;
    private javax.swing.JRadioButton option1B;
    private javax.swing.JRadioButton option1C;
    private javax.swing.JRadioButton option2A;
    private javax.swing.JRadioButton option2B;
    private javax.swing.JRadioButton option2C;
    private javax.swing.JRadioButton option3A;
    private javax.swing.JRadioButton option3B;
    private javax.swing.JRadioButton option3C;
    private javax.swing.JRadioButton option4A;
    private javax.swing.JRadioButton option4B;
    private javax.swing.JRadioButton option4C;
    private javax.swing.JRadioButton option5A;
    private javax.swing.JRadioButton option5B;
    private javax.swing.JRadioButton option5C;
    private javax.swing.JRadioButton page1;
    private javax.swing.JRadioButton page2;
    private javax.swing.JRadioButton page3;
    private javax.swing.JRadioButton page4;
    private javax.swing.JRadioButton page5;
    private javax.swing.JRadioButton page6;
    private javax.swing.JRadioButton page7;
    private javax.swing.JRadioButton page8;
    private javax.swing.JPanel panelText;
    private javax.swing.JLabel qs1H1;
    private javax.swing.JLabel qs1H2;
    private javax.swing.JLabel qs2H1;
    private javax.swing.JLabel qs2H2;
    private javax.swing.JLabel qs3H1;
    private javax.swing.JLabel qs3H2;
    private javax.swing.JLabel qs4H1;
    private javax.swing.JLabel qs4H2;
    private javax.swing.JLabel qs5H1;
    private javax.swing.JLabel qs5H2;
    private javax.swing.JButton start;
    private javax.swing.JButton submit;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JRadioButton option6A;
    private javax.swing.JRadioButton option6B;
    private javax.swing.JRadioButton option6C;
    private javax.swing.JRadioButton option6D;
    private javax.swing.JRadioButton option7A;
    private javax.swing.JRadioButton option7B;
    private javax.swing.JRadioButton option7C;
    private javax.swing.JRadioButton option7D;
    private javax.swing.JPanel panelImg;
    private javax.swing.JLabel qs6;
    private javax.swing.JLabel qs7;
}
