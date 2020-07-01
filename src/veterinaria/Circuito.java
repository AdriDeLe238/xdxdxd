/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.text.DecimalFormat;


public class Circuito {
    public double rb;
    public double vcc;
    public double rc;
    public double vbb; 
    public double b;
    public double r1;  
    public double r2; 
    public double re; 
    final double vbe=0.7; 
    public double rth;
    public double eth;
    DecimalFormat df = new DecimalFormat("#.00");
            
    //Resultados
       public double ib; 
        public double vrb;
        public double ic;
        public double ie;
        public double vce;
        public double vre; 
        public double vrc;
        public double vcb;
        public double vb; 
        public double vc;
        public double ve; 
        public double icsat; 
        public double vceq; 
        public double iceq; 
        public double icq;
        
        public double vth;
        
        public String imp_ib;
    public String imp_ic;
    public String imp_ie;
    public String imp_vce;
    public String imp_vrc;
    public String imp_vrb;
    public String imp_vre;
    public String imp_vb;
    public String imp_vc;
    public String imp_ve;
    public String imp_icsat;
    public String imp_vceq;
    public String imp_icq;
        
    public Circuito(){}
    
    public Circuito (double vcc1,double rb1, double rc1, double vbb1,double b1, double r11, double r21, double re1){
        this.b=Math.round(b1*100.0)/100.0; 
        this.r1=Math.round(r11*100.0)/100.0; 
        this.r2=Math.round((r21*1000)*100.0)/100.0; 
        this.rb=Math.round((rb1*1000)*100.0)/100.0; 
        this.rc=Math.round((rc1*1000)*100.0)/100.0; 
        this.re=Math.round((re1*1000)*100.0)/100.0; 
        this.vbb=Math.round(vbb1*100.0)/100.0; 
        this.vcc=Math.round(vcc1*100.0)/100.0; 
        
        
        
        //Resultados
        
        
    }
    
    //Polarizacion fija PENDIENTE
    public void PolFija (){
        //variables
        
        
        System.out.println("vcc: "+vcc);
        System.out.println("rb: "+rb);
        System.out.println("rc: "+rc);
        System.out.println("vbb: "+vbb);
        System.out.println("b: "+b);
        System.out.println("Llegaron valores a la funcion");
        //Ib
        ib = (vcc - vbe)/rb;
        vrb = b*rb; 
        ic = b*ib; 
        ie = ib + ic;
        vrc = ic*rc;
        vre = 0; 
        vb = vbe; 
        ve = 0; 
        vc = vcc-vrc;
        vce = vc - ve; 
        icsat = vcc/rc;
        vceq =vce ; 
        icq = ic; 
        
        
        
        System.out.println(ib*1000);
        System.out.println(vrb);
        System.out.println(ic*1000);
        System.out.println(ie*1000);
        System.out.println(vrc);
        System.out.println(vre);
        System.out.println(vb);
        System.out.println(ve);
        System.out.println(vc);
        System.out.println(vce);
        System.out.println(icsat*1000);
        System.out.println(vceq);
        System.out.println(icq*1000);
        
        
    }
    
    //Polarizacion Fija con Resistencia en Emisor LISTO
    public void PofEM(){
        System.out.println("vcc: "+vcc);
        System.out.println("rb: "+rb);
        System.out.println("rc: "+rc);
        System.out.println("vbb: "+vbb);
        System.out.println("b: "+b);
        System.out.println("re: "+re);
        System.out.println("Llegaron valores a la funcion");
        
        ib=(vcc-vbe)/(rb+((b+1)*re));
        ic=b*ic;
        vce=vcc-ic*(rc+re);
        ie=(b+1)*ib;
        icsat=vcc/(rc+re);
        vrb=ib*rb;
        vrc=ic*rc;
        vre=ie*re;
        vb=vbe+vre;
        ve=vre;
        vc=vcc-vrc;
        vceq=vce;
        icq=ic;
        
        System.out.println(ib*1000);
        System.out.println(vrb);
        System.out.println(ic*1000);
        System.out.println(ie*1000);
        System.out.println(vrc);
        System.out.println(vre);
        System.out.println(vb);
        System.out.println(ve);
        System.out.println(vc);
        System.out.println(vce);
        System.out.println(icsat*1000);
        System.out.println(vceq);
        System.out.println(icq*1000);
        
}
    
    //Polarizacion con divisor de voltaje LISTO
    public void PofDi(){
        System.out.println("vcc: "+vcc);
        System.out.println("re: "+re);
        System.out.println("rc: "+rc);
        System.out.println("r1: "+r1);
        System.out.println("b: "+b);
        System.out.println("r2: "+r2);
        System.out.println("Llegaron valores a la funcion");
        
        if((b*re)>=(10*r2)){
            vb=(r2*vcc)/(r1+r2);
            ve=vb-vbe;
            ie=ve/re;
            ib=ie/(b+1);
            ic=b*ib;
            vceq=vcc-ic*(rc+re);
            icq=ic;
          
        }else{
            rth=(r1*r2)/(r1+r2);
            vth=(r2*vcc)/(r1+r2);
            ib=(vth-vbe)/(rth+(b+1)*re);
            
        }
            vce=vcc-ic*(rc+re);
            icsat=vcc/(rc+re);
            vrc=ic*rc;
            vc=vcc-vrc;
            vre=ie*re;
            vrb=0;
            
            System.out.println(ib*1000);
        System.out.println(vrb);
        System.out.println(ic*1000);
        System.out.println(ie*1000);
        System.out.println(vrc);
        System.out.println(vre);
        System.out.println(vb);
        System.out.println(ve);
        System.out.println(vc);
        System.out.println(vce);
        System.out.println(icsat*1000);
        System.out.println(vceq);
        System.out.println(icq*1000);
        
    }
    
    //Polarizacion con realimentacion
    public void Real(){
        System.out.println("vcc: "+vcc);
        System.out.println("re: "+re);
        System.out.println("rc: "+rc);
        System.out.println("r1: "+r1);
        System.out.println("b: "+b);
        System.out.println("r2: "+r2);
        System.out.println("Llegaron valores a la funcion");
        //Validamos si son dos resistencias en serie
        if(r2==0){
            rb=r1;
            
        }else{
            rb=r1+r2;
        }
            
        //CALCULOS
            ib=(vcc-vbe)/(b+(b+1)*(rc+re));
            vrb=ib*rb;
            ic=b*ib;
            vce=vcc-ic*(rc+re);
            icsat=vcc/(rc+re);
            vrc=ic*rc;
            ie=(b+1)*ib;
            vre=ie*re;
            vb=vbe+vre;
            ve=vre;
            vc=vcc-vrc;
            icq=ic;
            vceq=vce;
        
            System.out.println(ib*1000);
        System.out.println(vrb);
        System.out.println(ic*1000);
        System.out.println(ie*1000);
        System.out.println(vrc);
        System.out.println(vre);
        System.out.println(vb);
        System.out.println(ve);
        System.out.println(vc);
        System.out.println(vce);
        System.out.println(icsat*1000);
        System.out.println(vceq);
        System.out.println(icq*1000);
    }
    
    //Polarizacion de Base comun ICSAT DUDOSO
    public void BaseComun(){
        System.out.println("vcc: "+vcc);
        System.out.println("vbb: "+vbb);
        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);
        System.out.println("b: "+b);
        System.out.println("Llegaron valores a la funcion");
        
        //CALCULOS LVK
        
        ie=(vbb-vbe)/r1;
        ib=ie/(b+1);
        ic=b*ib;
        vrc=r2*ie;
        vce=vcc+vbb-ie*r1-vrc;
        vcb=vcc-vrc;      
        vb=0;
        vre=ie*r2;
        ve=vre;
        vc=vbb-vrc;
        vceq=vce;
        icq=ic;
        icsat=vcc/(rc+re);
        
        System.out.println(ib*1000);
        System.out.println(vrb);
        System.out.println(ic*1000);
        System.out.println(ie*1000);
        System.out.println(vrc);
        System.out.println(vre);
        System.out.println(vb);
        System.out.println(ve);
        System.out.println(vc);
        System.out.println(vce);
        System.out.println(icsat*1000);
        System.out.println(vceq);
        System.out.println(icq*1000);
        
    }
    
    //
    public void cadenas(){
        imp_ib=ib*1000+" mA";
        imp_ic=ic*1000+" mA";
        imp_ie=ie*1000+" mA";
        imp_vce=vce+" V";
        imp_vrc=vrc+" V";
        imp_vrb=vrb+" V";
        imp_vre=vre+" V";
        imp_vb=vb+" V";
        imp_vc=vc+" V";
        imp_ve=ve+" V";
        imp_icsat=icsat*1000+" mA";
        imp_vceq=vceq+" V";
    }
}

    
