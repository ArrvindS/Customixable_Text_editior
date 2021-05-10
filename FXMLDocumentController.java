/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2q2;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Arrvind
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextArea inputString;
     @FXML
    private TextArea outputString;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private void handleQuitAction(ActionEvent event)
    {
        Platform.exit();
    }
      
@FXML
    private void handleButtonComputeAction(ActionEvent event)//On Clicking Execute
{
        String cha;
      
        cha=inputString.getText();
        
        
        String []cha1=cha.split("\n");
        int count=cha1.length;
        for(int i=0;i<count;i++)
        {
            cha1[i] = cha1[i].replaceAll("\\s", ""); 
            matrix(cha1[i]);
        }
        
}     
    private int matrix(String cha1)
    {
        int [][]mat=new int[8][6];
        int m=cha1.length()*7;
        int[][] letters=new int[8][m];
        for(int i=0;i<cha1.length();i++)
        {
            char d=cha1.charAt(i);
            switch(d)
            {
                  case 'A':
                           mat= capA();
                            break;
                case 'B':
                            mat=capB();
                            break;
                 case 'C':
                            mat=capC();
                            break;
                case 'D':
                            mat=capD();
                            break;
                case 'E':
                            mat=capE();
                            break;
                case 'F':
                            mat=capF();
                            break;
                case 'G':
                            mat=capG();
                            break;
                case 'H':
                            mat=capH();
                            break;
                case 'I':
                            mat=capI();
                            break;
                case 'J':
                            mat=capJ();
                            break;
                case 'K':
                            mat=capK();
                            break;
                case 'L':
                            mat=capL();
                            break;
                case 'M':
                            mat=capM();
                            break;
                case 'N':
                            mat=capN();
                            break;
                case 'O':
                            mat=capO();
                            break;
                case 'P':
                            mat=capP();
                            break;
                case 'Q':
                            mat=capQ();
                            break;
                case 'R':
                            mat=capR();
                            break;
                case 'S':
                            mat=capS();
                            break;
                case 'T':
                            mat=capT();
                            break;
                case 'U':
                            mat=capU();
                            break;
                case 'V':
                          mat= capV();
                            break;
                case 'W':
                           mat=capW();
                            break;
                case 'X':
                           mat=capX();
                            break;
                case 'Y':
                            mat=capY();
                            break;
                case 'Z':
                            mat=capZ();
                            break;
                            
                case 'a':
                            mat=lowa();
                            break;
                case 'b':
                            mat=lowb();
                            break;
                case 'c':
                            mat=lowc();
                            break;
                case 'd':
                            mat=lowd();
                            break;
                case 'e':
                            mat=lowe();
                            break;                          
                case 'f':
                            mat=lowf();
                            break;
                case 'g':
                            mat=lowg();
                            break;
                case 'h':
                            mat=lowh();
                            break;
                case 'i':
                            mat=lowi();
                            break;
                case 'j':
                            mat=lowj();
                            break;
                case 'k':
                            mat=lowk();
                            break;
                case 'l':
                            mat=lowl();
                            break;
                case 'm':
                            mat=lowm();
                            break;
                case 'n':
                            mat=lown();
                            break;
                case 'o':
                            mat=lowo();
                            break;
                case 'p':
                            mat=lowp();
                            break;
                case 'q':
                            mat=lowq();
                            break;
                case 'r':
                            mat=lowr();
                            break;
                case 's':
                            mat=lows();
                            break;
                case 't':
                            mat=lowt();
                            break;
                case 'u':
                           mat=lowu();
                            break;
                case 'v':
                            mat=lowv();
                            break;
                case 'w':
                            mat=loww();
                            break;
                case 'x':
                            mat=lowx();
                            break;
                case 'y':
                            mat=lowy();
                            break;
                case 'z':
                            mat=lowz();
                            break;
                case '0':
                            mat=num0();
                            break; 
                             
                case '1':
                            mat=num1();
                            break;
                case '2':
                            mat=num2();
                            break; 
                case '3':
                            mat=num3();
                            break;
                case '4':
                            mat=num4();
                            break;
                case '5':
                            mat=num5();
                            break;
                case '6':
                            mat=num6();
                            break;
                case '7':
                            mat=num7();
                            break;
                case '8':
                            mat=num8();
                            break;
                case '9':
                            mat=num9();
                            break;
                case '`':
                            mat=tilde();
                            break;            
                case '!':
                            mat=exclamation();
                            break;            
                case '@':
                            mat=attherate();
                            break;


                case '#':
                            mat=hash();
                            break;
                case '$':
                            mat=dolar();
                            break;    
                case '%':
                            mat=percent();
                            break;
                case '^':
                            mat=raisedto();
                            break;
                case '&':
                            mat=and();
                            break;
                case '*':
                            mat=multiply();
                            break;
                case '(':
                            mat=openbracket();
                            break;
                case ')':
                            mat=closebracket();
                            break;
                case '+':
                           mat= plus();
                            break;
                case '/':
                           mat=slash();
                            break;
                case '<':
                            mat=greater();
                            break;
                case '>':
                            mat=lessthan();
                            break;           
                case ',':
                            mat=comma();
                            break;            
                case '.':
                            mat=fullstop();
                            break;
                case '=':
                            mat=equalto();
                            break;
                case '-':
                            mat=dash();
                            break;
                case ' ':
                    outputString.appendText(" \t");
            }
            for(int j=0;j<8;j++)
            {
                int m2=i*7;
                for(int jrow=m2,jcol=0;jcol<6&& jrow<m2+6;jcol++,jrow++)
                {
                    letters[j][jrow]=mat[j][jcol];
                }
            }
    }
     print(letters,m);
     return 0;

    }

    //Matrix for capital letters
 private int[][] capA() 
{
    
       int [][]mat={ {0,0,1,1,0,0},
                     {0,1,0,0,1,0},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1},
                     {1,1,1,1,1,1},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1}   };
               return mat;
}
 private  int[][] capB()
{
        int [][]mat={   {1,1,1,1,1,0},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,0},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,0}   };
        return mat;
  
} 
  private int[][] capC()
{
      int [][]mat= {    {1,1,1,1,1,1},
                      {1,0,0,0,0,0},
                      {1,0,0,0,0,0},
                      {1,0,0,0,0,0},
                      {1,0,0,0,0,0},
                      {1,0,0,0,0,0},
                      {1,0,0,0,0,0},
                      {1,1,1,1,1,1}   };
        return mat;
}
 private int[][] capD()
{
    int [][]mat= {   {1,1,1,1,1,0},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1},
                     {1,0,0,0,0,1},
                     {1,1,1,1,1,0}   };
           return(mat);
  }
 private int[][] capE()
 {
       int [][]mat= {    {1,1,1,1,1,1},
                       {1,0,0,0,0,0},
                       {1,0,0,0,0,0},
                       {1,0,0,0,0,0},
                       {1,1,1,1,1,1},
                       {1,0,0,0,0,0},
                       {1,0,0,0,0,0},
                       {1,1,1,1,1,1}   };
          return(mat);
 }
  private int[][] capF()
{
                   
        int [][]mat= {    {1,1,1,1,1,1},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,1,1,1,1,1},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0}   };
           return(mat);
}
  private  int[][] capG()
 {
                      
        int [][]mat ={    {1,1,1,1,1,1},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,1,1,1},
                        {1,0,0,1,0,1},
                        {1,0,0,1,0,1},
                        {1,1,1,1,0,1}};
            return(mat);
 }
                  
                                                                                                                 
 private  int[][] capH(){
         int [][]mat ={   {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1}};
return(mat);
}

 private  int[][] capI(){
         int [][]mat ={   {1,1,1,1,1,1},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {1,1,1,1,1,1}};
         return(mat);
}

 private int[][] capJ(){
         int [][]mat={    {1,1,1,1,1,1},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {1,0,0,1,0,0},
                        {1,0,0,1,0,0},
                        {1,1,1,1,0,0}};
        return(mat);    
     }
  private int[][] capK()
{
         int [][]mat={    {1,0,0,0,0,1},
                        {1,0,0,0,1,0},
                        {1,0,0,1,0,0},
                        {1,0,1,0,0,0},
                        {1,1,1,0,0,0},
                        {1,0,0,1,0,0},
                        {1,0,0,0,1,0},
                        {1,0,0,0,0,1}};
         return(mat);
}
private  int[][] capL()
{
          int [][]mat={   {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,1,1,1,1,1}};
          return(mat);}
 private  int[][] capM()
{
          int [][]mat={   {1,0,0,0,0,1},
                        {1,1,0,0,1,1},
                        {1,0,1,1,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1}};
            return(mat);
}

 private int[][] capN()
{
           int [][]mat={  {1,0,0,0,0,1},
                        {1,1,0,0,0,1},
                        {1,0,1,0,0,1},
                        {1,0,0,1,0,1},
                        {1,0,0,0,1,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1}};
           return(mat);
}
private  int[][] capO()
{
          int [][]mat={   {0,1,1,1,1,0},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {0,1,1,1,1,0}};
           return(mat);
}
 private  int[][] capP()
{
            int [][]mat={  {1,1,1,1,1,0},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,1,1,1,1,0},
                         {1,0,0,0,0,0},
                         {1,0,0,0,0,0},
                         {1,0,0,0,0,0},
                         {1,0,0,0,0,0}};
          return(mat);
}
 private  int[][] capQ()
{
            int [][]mat={ {0,1,1,1,1,0},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,1,0,1},
                        {0,1,1,1,1,0},
                        {0,0,0,0,0,1}};
          return(mat);
}
 private  int[][] capR()
{
            int [][]mat={ {1,1,1,1,1,0},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,0},
                        {1,0,1,0,0,0},
                        {1,0,0,1,0,0},
                        {1,0,0,0,1,0},
                        {1,0,0,0,0,1}};
              return(mat);
}
 private  int[][] capS()
{
             int [][]mat={ {0,1,1,1,1,1},
                         {1,0,0,0,0,0},
                         {1,0,0,0,0,0},
                         {1,0,0,0,0,0},
                         {1,1,1,1,1,1},
                         {0,0,0,0,0,1},
                         {0,0,0,0,0,1},
                         {1,1,1,1,1,0}};
           return(mat);
}
 private  int[][] capT()
{
            int [][]mat={  {1,1,1,1,1,1},
                         {0,0,1,0,0,0},
                         {0,0,1,0,0,0},
                         {0,0,1,0,0,0},
                         {0,0,1,0,0,0},
                         {0,0,1,0,0,0},
                         {0,0,1,0,0,0},
                         {0,0,1,0,0,0}};
           return(mat);
}
 private int[][] capU()
{
            int [][]mat={  {0,0,0,0,0,0},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {0,1,1,1,1,0}};
          return(mat);
}
private   int[][] capV()
{
            int [][]mat={  {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {1,0,0,0,0,1},
                         {0,1,0,0,1,0},
                         {0,0,1,1,0,0}};
           return(mat);
}

 private  int[][] capW()
{
            int [][]mat={ {0,0,0,0,0,0},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,1,1,0,1},
                        {1,1,0,0,1,1},
                        {1,0,0,0,0,1},
                        {0,0,0,0,0,0}};
        return(mat);
}
 private  int[][] capX()
{
            int [][]mat={ {0,0,0,0,0,0},
                        {1,0,0,0,0,1},
                        {0,1,0,0,1,0},
                        {0,0,1,1,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,0,1,0},
                        {1,0,0,0,0,1},
                        {0,0,0,0,0,0}};
        return(mat);
}
  private int[][] capY()
{
            int [][]mat={ {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {0,1,0,0,1,0},
                        {0,0,1,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0}};
           return(mat);
}
private  int[][] capZ()
{
            int [][]mat={ {1,1,1,1,1,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,1,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,1,1,1,1,1}};
             return(mat);
}
//Small letters 
private  int[][] lowa()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,1,1,0,0},
                        {1,0,0,0,1,0},
                        {1,0,0,0,1,0},
                        {1,0,0,0,1,1},
                        {0,1,1,1,0,1}   };
             return(mat);
}
private  int[][] lowb()
{
       int [][]mat=   {  {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,0,0,0,0},
                        {0,1,1,1,0,0},
                        {0,1,0,0,1,0},
                        {0,1,0,0,1,0},
                        {0,1,1,1,1,0}   };

             return(mat);
}private  int[][] lowc()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,1,1,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {0,1,1,1,0,0}   };
             return(mat);
}private  int[][] lowd()
{
       int [][]mat=   {  {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,1,0},
                        {0,0,1,1,1,0},
                        {0,1,0,0,1,0},
                        {0,1,0,0,1,0},
                        {0,0,1,1,1,0}   };
             return(mat);
}private  int[][] lowe()
{
       int [][]mat=   {  {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,1,1,1},
                        {0,1,0,0,0,1},
                        {0,1,1,1,1,1},
                        {0,1,0,0,0,0},
                        {0,0,1,1,1,1}   };
             return(mat);
}private  int[][] lowf()
{
       int [][]mat=   {  {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,1,1,1,0},
                        {0,0,1,0,0,0},
                        {0,0,1,0,0,0}   };
             return(mat);
}private  int[][] lowg()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,0,1,0},
                        {0,0,1,1,1,0},
                        {0,0,0,0,1,0},
                        {0,0,1,1,1,0}   };
             return(mat);
}private  int[][] lowh()
{
       int [][]mat=   {  {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,1,1,1,0},
                        {0,0,1,0,1,0},
                        {0,0,1,0,1,0}   };
             return(mat);
}private  int[][] lowi()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,1,0,0,0}   };

             return(mat);
}private  int[][] lowj()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,1,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,1,0},
                        {0,0,1,0,1,0},
                        {0,0,0,1,1,0}   };
             return(mat);
}private  int[][] lowk()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,0,1,0,0},
                        {0,1,1,0,0,0},
                        {0,1,0,1,0,0},
                        {0,1,0,0,1,0},
                        {0,1,0,0,0,1}   };
             return(mat);
}private  int[][] lowl()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0}   };
             return(mat);
}private  int[][] lowm()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {1,1,1,1,1,0},
                        {1,0,1,0,1,0},
                        {1,0,1,0,1,0},
                        {1,0,1,0,1,0}   };

             return(mat);
}private  int[][] lown()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {0,1,1,1,1,0},
                        {0,1,0,0,1,0},
                        {0,1,0,0,1,0},
                        {0,1,0,0,1,0}   };
             return(mat);
}private  int[][] lowo()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,0,1,0},
                        {0,0,1,1,0,0},
                        {0,0,0,0,0,0}   };

             return(mat);
}private  int[][] lowp()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,1,0,0,0},
                        {0,1,0,1,0,0},
                        {0,1,1,1,0,0},
                        {0,1,0,0,0,0},
                        {0,1,0,0,0,0} 
                       ,{0,1,0,0,0,0}};
             return(mat);
}private  int[][] lowq()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,1,1,0},
                        {0,0,1,0,1,0},
                        {0,0,1,1,1,0},
                        {0,0,0,0,1,0},
                        {0,0,0,0,1,0}  
                       ,{0,0,0,0,1,0}};
             return(mat);
}private  int[][] lowr()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {0,1,0,0,0,0},
                        {0,1,1,1,0,0},
                        {0,1,0,0,0,0},
                        {0,1,0,0,0,0},
                        {0,1,0,0,0,0}   };
             return(mat);
}private  int[][] lows()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,1,1,0},
                        {0,0,1,0,0,0},
                        {0,0,1,1,1,0},
                        {0,0,0,0,1,0},
                        {0,0,1,1,1,0}   };
             return(mat);
}private  int[][] lowt()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,1,1,1,0,0},
                        {0,0,1,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,0,1,1,0}   };
             return(mat);
}private  int[][] lowu()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,0,0,1,0},
                        {0,1,0,0,1,0},
                        {0,1,1,1,1,0},
                        {0,0,0,0,0,1}   };
             return(mat);
}private  int[][] lowv()
{
       int [][]mat=   { {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {1,0,0,0,0,1},
                        {0,1,0,0,1,0},
                        {0,0,1,1,0,0},
                        {0,0,0,0,0,0}   };

             return(mat);
}

 private  int[][] loww()
{
       int [][]mat= {   {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {1,0,0,0,0,1},
                        {1,0,1,1,0,1},
                        {1,1,0,0,1,1},
                        {1,0,0,0,0,1}   };

             return(mat);
}
  private int[][] lowx()
{
       int [][]mat= {   {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,0,0,1,0},
                        {0,0,1,1,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,0,1,0}   };
         return(mat);
}
  private int[][] lowy()
{
       int [][]mat= {   {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,1},
                        {0,0,1,0,0,1},
                        {0,0,1,1,1,1},
                        {0,0,0,0,0,1},
                        {0,1,1,1,1,1}   };
                return(mat);
}
 private int[][] lowz()
{
       int [][]mat= {  {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,1,1,1,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,1,1,1,0}   };
       return(mat);
}
 //Digits
 private int[][] num0()
 {
     int [][]mat= {     {0,0,1,1,0,0},
                        {0,1,0,0,1,0},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {0,1,0,0,1,0},
                        {0,0,1,1,0,0}   };
     return(mat);

 }
 private int[][] num1()
 {
    int [][]mat= {      {0,0,0,1,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {1,1,1,1,1,1}   };
     return(mat);

 }
 private int[][] num2()
 {
   int [][]mat= {       {0,1,1,1,1,0},
                        {1,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,1,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,1,0},
                        {0,1,0,0,0,0},
                        {1,1,1,1,1,1}   };

     return(mat);

 }
 private int[][] num3()
 {
    int [][]mat= {      {1,1,1,1,1,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {1,1,1,1,1,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {1,1,1,1,1,1}   };
     return(mat);

 }
 private int[][] num4()
 {
    int [][]mat= {      {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,1,0},
                        {1,1,1,1,1,1},
                        {0,0,0,0,1,0},
                        {0,0,0,0,1,0},
                        {0,0,0,0,1,0}   };
     return(mat);

 }
 private int[][] num5()
 {
    int [][]mat= {      {1,1,1,1,1,1},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,1,1,1,1,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {1,1,1,1,1,1}   };
     return(mat);

 }
 private int[][] num6()
 {
    int [][]mat= {      {1,1,1,1,1,1},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,0,0,0,0,0},
                        {1,1,1,1,1,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,1}   };
     return(mat);

 }
 private int[][] num7()
 {
   int [][]mat= {       {1,1,1,1,1,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1}   };
     return(mat);

 }
 private int[][] num8()
 {
    int [][]mat= {      {1,1,1,1,1,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,1}   };
     return(mat);

 }
 private int[][] num9()
 {
    int [][]mat= {      {1,1,1,1,1,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,0,0,0,0,1},
                        {1,1,1,1,1,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {1,1,1,1,1,1}   };
     return(mat);

 }
 //Specials Characters
  private int[][] tilde()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,1,0,1},
                        {1,0,0,0,1,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 } 
  private int[][] exclamation()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,1,0,0}   };

     return(mat);

 } 
 private int[][] attherate()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,0,1,0},
                        {1,0,1,1,0,1},
                        {1,0,1,1,1,1},
                        {0,1,0,0,0,0},
                        {0,0,1,1,0,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 }
 private int[][] hash()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,0,1,0,0},
                        {1,1,1,1,1,0},
                        {0,1,0,1,0,0},
                        {1,1,1,1,1,0},
                        {0,1,0,1,0,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 } 
 private int[][] dolar()
 {
    int [][]mat= {     {0,0,1,1,0,0},
                        {0,1,1,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,1,1,0,0},
                        {0,0,1,0,1,0},
                        {0,0,1,1,0,0},
                        {0,1,1,0,0,0},
                        {0,0,1,0,0,0}   };
     return(mat);

 } 
 private int[][] percent()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,0,0,1,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,0,0,0,1,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 }
 private int[][] raisedto()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,1,0,0},
                        {1,0,0,0,1,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0}   };

     return(mat);

 } 
 private int[][] and()
 {
    int [][]mat= {     {0,0,0,0,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,0,1,0},
                        {0,1,0,1,0,0},
                        {0,0,1,0,0,1},
                        {0,1,0,1,1,0},
                        {0,1,0,1,1,0},
                        {0,0,1,0,0,1}   };
     return(mat);

 } 
 private int[][] multiply()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,0,0,1,0},
                        {0,0,1,1,0,0},
                        {0,0,1,1,0,0},
                        {0,1,0,0,1,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 } 
 private int[][] openbracket()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,0,0,0},
                        {0,1,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 } 
 private int[][] closebracket()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,0,1,0},
                        {0,0,0,0,0,1},
                        {0,0,0,0,0,1},
                        {0,0,0,0,1,0},
                        {0,0,0,1,0,0},
                        {0,0,0,0,0,0}   };

     return(mat);

 } 
 private int[][] plus()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,1,0,0,0},
                        {1,1,1,1,1,0},
                        {0,0,1,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 } 
 private int[][] slash()
 {
    int [][]mat= {       {0,0,0,0,0,0},
                        {0,0,0,0,0,1},
                        {0,0,0,0,1,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,0,0,0,0,0},
                        {0,0,0,0,0,0}   };

     return(mat);

 } 
 private int[][] greater()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,0,0,0,0,0},
                        {0,1,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,0,1,0,0}   };
     return(mat);

 } 
 private int[][] lessthan()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,0,1,0},
                        {0,0,0,0,0,1},
                        {0,0,0,0,1,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0}   };
     return(mat);

 } 
 private int[][] comma()
 {
    int [][]mat= {     {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,1,0},
                        {0,0,0,0,1,0},
                        {0,0,0,1,0,0},
                        {0,0,1,0,0,0}   };
     return(mat);

 } 
 private int[][] fullstop()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,1,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0}   };

     return(mat);

 } 
 private int[][] equalto()
 {
    int [][]mat= {     {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,1,1,1,0},
                        {0,0,0,0,0,0},
                        {0,1,1,1,1,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0}   };
     return(mat);

 }
 private int[][] dash()
 {
    int [][]mat= {      {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,1,1,1,1,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,0,0,0,0}   };
	
     return(mat);
 }
  
private  void print(int c[][],int m){  //print function
         
        for(int i=0;i<=7;i++)
        {
            
            for(int j=0;j<m;j++)
            {            
                if(c[i][j]==1)
                    outputString.appendText("\t*");
                else
                    outputString.appendText("\t");
            }    outputString.appendText(" \n ");        
                   
                    
        }
        outputString.appendText("\n\n");
                                  
 
        
    }
}        
        





