package edu.ytu.nerdle.app;


import edu.ytu.nerdle.core.util.equation.EquationUtil;
import edu.ytu.nerdle.frontend.mainPage.MainPage;

import java.util.ArrayList;
import java.util.Random;

public class App {
//    public static void main(String[] args) {
//        //System.out.println(EquationUtil.infixToPrefix("A*B+C/D".toCharArray()));
//        System.out.println(EquationUtil.infixToPrefix(
//                EquationUtil.generateEquation().toCharArray()
//        ));
//        //Equation equation = new Equation(new Random().nextInt(2) + 7);
//
//        MainPage mainPage = new MainPage();
//        mainPage.pack();
//        mainPage.setVisible(true);
//    }

    public static void main(String[] args) {
        char [] Characters = {'0','1','2','3','4','5','6','7','8','9'}; // Defining the operand pool
        char [] Operators ={'+','-','*','/'};							// Defining the operator pool
        char equal='=';
        int equationDone=0;

        ArrayList<Character> equation = new ArrayList<Character>();

        char options [] = new char[4];
        int positions [] = new int[2];
        char operatorList[]=new char[2];

        positions[0]=0;
        positions[0]=0;
        int tmp=0;


        char operand1[]=new char[3]; //operand 1 in rakamlari
        char operand2[]=new char[3];//operand 2 ni rakamlari
        char operand3[]=new char[3];//varsa operand 3 un rakamlari


        //int halleri
        int op1=0;
        int op2=0;
        int op3=0;
        int tmpresult=0; //cift operandli islemler icin gecici sonuc, bir isleme daha girecek cunku
        int result=0; //sonuc

        options[0]=getRandom(Characters);
        options[1]=getRandom(Characters);
        options[2]=getRandom(Characters);
        options[3]=getRandom(Characters);



        for(int i=0;i<options.length;i++) {
            System.out.print(options[i]);
        }

        System.out.println("\n******\n");

        int operatorNumber=0;
        Random rand = new Random();
        operatorNumber=rand.nextInt(2)+1;
        System.out.println("Operator number: "+ operatorNumber);
        if(operatorNumber==1) {
            operatorList[0]=getRandom(Operators);
        }
        else if(operatorNumber==2) {
            operatorList[0]=getRandom(Operators);
            operatorList[1]=getRandom(Operators);
        }
        System.out.println("Operators:");
        for(int i=0;i<operatorNumber;i++) {
            System.out.println(operatorList[i]);
        }

        if(operatorNumber==1) { //2 operand var, 4lu dizi ikiye bolunecek
            positions[0]=rand.nextInt(3)+1;
            System.out.println("positions[0]: "+ positions[0]);

            for(int i=0;i<positions[0];i++) { //sayiyi olustur
                operand1[i]=options[i];
            }


            for(int i=0;i<options.length-positions[0];i++) {//sayiyi olustur
                operand2[i]=options[i+positions[0]];
            }




        }
        else if(operatorNumber==2) { //3 operand var
            positions[0]=rand.nextInt(3)+1;
            positions[1]=rand.nextInt(3)+1;


            while(positions[0]==positions[1]) { //operator yerleri ayniysa gir ve degistir
                positions[1]=rand.nextInt(3)+1;
            }
            if(positions[0]>positions[1]) {
                tmp=positions[0];
                positions[0]=positions[1];
                positions[1]=tmp;
            }
            System.out.println("positions0:"+positions[0]);
            System.out.println("positions1:"+positions[1]);
            for(int i=0;i<positions[0];i++) {
                operand1[i]=options[i];
            }
            for(int i=0;i<positions[1]-positions[0];i++) {
                operand2[i]=options[i+positions[0]];
            }
            for(int i=0;i<options.length-positions[1];i++) {
                operand3[i]=options[i+positions[1]];
            }



        }

        //operand1 i integerlestirme
        int c=positions[0]-1;
        int p=0;
        for(int j=c;j>=0 ;j--) {

            op1+=Character.getNumericValue(operand1[j])*Math.pow(10,p);
            p++;
        }
        op1=op1%1000;
        //operand2yi integerlestirme
        if(positions[1]!=0) {
            c=positions[1]-positions[0]-1;
            p=0;
            for(int j=c;j>=0 ;j--) {

                op2+=Character.getNumericValue(operand2[j])*Math.pow(10,p);
                p++;
            }
        }


        else {
            c=options.length-positions[0]-1;
            p=0;
            for(int j=c;j>=0 ;j--) {

                op2+=Character.getNumericValue(operand2[j])*Math.pow(10,p);
                p++;
            }
        }
        op1=op1%1000;

        //operand3 u integerlestirme
        //operand 3 varsa zaten positions[1] de vardir
        if(positions[1]!=0) {
            c=options.length-positions[1]-1;
            p=0;
            for(int j=c;j>=0 ;j--) {

                op3+=Character.getNumericValue(operand3[j])*Math.pow(10,p);
                p++;
            }
            op3=op3%1000;
        }


        System.out.println();
        System.out.print("Operand 1:");

        for(int i=0;i<operand1.length;i++) {
            System.out.print(operand1[i]);
        }

        System.out.println();
        System.out.print("Operand 2:");

        for(int i=0;i<operand2.length;i++) {
            System.out.print(operand2[i]);
        }

        System.out.println();
        System.out.print("Operand 3:");

        for(int i=0;i<operand3.length;i++) {
            System.out.print(operand3[i]);
        }

        System.out.println("\n--------------");
        System.out.println("op1:"+op1);
        System.out.println("op2:"+op2);
        System.out.println("op3:"+op3);

        System.out.println("OperatorList"+operatorList[0]);

        while(equationDone!=1) {
            if(operatorNumber==1) {
                if(operatorList[0]=='+') {
                    result=op1+op2;
                    equationDone=1;
                }
                else if(operatorList[0]=='-') {
                    if(op1>=op2) {
                        result=op1-op2;
                        equationDone=1;
                    }
                    else {
                        tmp=op1;
                        op1=op2;
                        op2=tmp;
                        result=op1-op2;
                        equationDone=1;
                    }
                }
                else if(operatorList[0]=='*') {
                    result=op1*op2;
                    equationDone=1;
                }
                else if((operatorList[0]=='/')&&(op2!=0)) {
                    result=op1/op2;
                    equationDone=1;
                }
                else
                    System.out.println("Error");
                equationDone=1;
            }

            else if(operatorNumber==2) {
                //
            }
        }




        System.out.println("result:"+result);

    }
    static char getRandom(char [] Characters) {
        int rnd = new Random().nextInt(Characters.length);
        return Characters[rnd];
    }
}
