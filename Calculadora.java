
import java.awt.*;
import java.awt.event.*;

 public class Calculadora extends Frame implemets ActionListener
 {   
     private TextField t1 = new TextField(30);
     private Button functionb1 new = Button[7]
     private Panel p1 = new Panel();
     private Button b1 = new Button[8];
     private Button somaButton,divButton,subButton,mulButton,limpaButton, igualButton, pontoButton;
     private  double num1=0,num2=0,result=0;
	 private char operador;


     public Calculadora( String Titulo, int largura, int altura, int colinic,
     int lininic)
     {
        super(Titulo);
        setSize(largura,altura);
        setLocation(colinic,lininic);
        setLayout(new FlowLayout());

         somaButton = new Button("+");
         divButton = new Button("/");
         subButton = new Button("-");
         mulButton = new Button("*");
         limpaButton = new Button("Limpa");
         igualButton = new Button("=");
         pontoButton = new Button(".");

         functionb1[0]= somaButton;
         functionb1[1] = divButton;
         functionb1[2] = subButton;
         functionb1[3] = mulButton;
         functionb1[4] = limpaButton;
         functionb1[5] = igualButton;
         functionb1[6] = pontoButton;

        for(int i =0;i<6;i++)
            functionb1[i].addActionListener(this);
     
         for(int i =0;i<8;i++)
           b1[i].addActionListener(this);

       /* for (int x= 0; x<=17; x++){
         b1.add(new Button [s[x]]);
         conta[x]; 
         }*/
      p1.add(t1);
      p1.add(b1[7]);
      p1.add(b1[8]);
      p1.add(b1[9]);
      p1.add(divButton);
      p1.add(b1[4]);
      p1.add(b1[5]);
      p1.add(b1[6]);
      p1.add(mulButton);
      p1.add(b1[1]);
      p1.add(b1[2]);
      p1.add(b1[3]);
      p1.add(subButton);
      p1.add(b1[0]);
      p1.add(pontoButton);
      p1.add(igualButton);
      p1.add(somaButton);
      p1.add(limpaButton);
     }

public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==somaButton) {
			num1 = Double.parseDouble(textfield.getText());
			operador ='+';
			textfield.setText("");
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='-';
			textfield.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='*';
			textfield.setText("");
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='/';
			textfield.setText("");
		}

		if(e.getSource()==igualButton) {
			num2=Double.parseDouble(textfield.getText());

     try{
           switch(operador) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}

     } catch (Exepction e)
     { System.out.print("operação impossivel de ser realizada")} 

       } 
     }
  static void main(String[] args){
       Calculadora cal = new Calculadora();
       cal.setVisible(true);
  }

 
 }