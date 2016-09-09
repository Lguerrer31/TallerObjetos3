/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author coste
 */
public class Complejos {
    
    private int n;
    private int n1;
    
    public Complejos(int n, int n1) throws CeroException{
        this.n = n;
        this.n1 = n1;
        
        if (n == 0){
            throw new CeroException();
        } else if (n1 == 0){
            throw new CeroException();
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    
    public Complejos suma(Complejos c2) throws CeroException{
        int n, n1;
        Complejos m;
        n = this.n + c2.n;
        n1 = this.n1 + c2.n1;
        m = new Complejos(n, n1);
        return m;
    }
    
    public Complejos resta(Complejos c2) throws CeroException{
        int n, n1;
        Complejos m;
        n = this.n - c2.n;
        n1 = this.n1 - c2.n1;
        m = new Complejos(n, n1);
        return m;
    }
    
}
