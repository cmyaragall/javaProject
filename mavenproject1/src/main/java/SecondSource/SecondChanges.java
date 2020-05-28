/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondSource;

import FirstSource.First;

/**
 *
 * @author WildJasmine
 */
public class SecondChanges extends First{
    int i,j;
    public SecondChanges(int k,int j){
        i=k;
        this.j=j;
        System.out.println(i);
        System.out.println(j);
        
    }
    
    @Override
    public void compute(int j){
        System.out.println("j="+j);
        //System.out.println("k="+k);
    }
    
    public static void main(String[] args) {
        SecondChanges s=new SecondChanges(11, 22);
        s.compute(111);
        System.out.println("This is main method");
        
    }
    
}
