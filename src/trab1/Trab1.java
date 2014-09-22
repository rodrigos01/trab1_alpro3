/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trab1;

/**
 *
 * @author rodrigo
 */
public class Trab1 {
    
    public static long testes = 0;
    public static long startTime = System.currentTimeMillis();
    
    public static long getTime() {
        return System.currentTimeMillis() - startTime;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 19;//Integer.parseInt(args[0]);
        
        int[] cabines = new int[num];
        
        //esvaziando as cabines
        for(int i=0; i<cabines.length; i++) {
            cabines[i] = 2;
        }
        
        //int possib = testa(num, cabines);
        //int possib = testa1(num, cabines, 2);
        //int possib = testa2(num, cabines, 2);
        int possib = testa3(num, cabines, 2);
        
        System.out.println("Numero de possibilidades para "+num+" cabines: "+possib); 
        System.out.println("Numero de testes "+testes);
        System.out.println("Tempo: "+getTime());
        
    }
    
    
    public static int testa(int spies, int[] cabines) {
        if(spies == 0) {
            return 1;
        }
        int ant, prox;
        int possib = 0;
        
        //testando
        boolean found = false;
        for(int i = 2; i>=0 && !found; i--) {
            for(int j=0; j<cabines.length; j++) {
                ant = j-1;
                prox = j+1;
                testes++;
                if(cabines[j] == i) {
                    found = true;
                    int[] newcabs = cabines.clone();
                    newcabs[j] = -1;
                    if(ant >=0) {
                        newcabs[ant]--;
                    }
                    if(prox<newcabs.length) {
                        newcabs[prox]--;
                    }
                    possib+=testa(spies-1, newcabs);
                }
            }
        }
        return possib;
        
    }
    
    public static int testa1(int spies, int[] cabines, int numMax) {
        if(spies == 0) {
            return 1;
        }
        int ant, prox;
        int possib = 0;
        
        //testando
        boolean found = false;
        while(numMax>=0 && !found) {
            for(int j=0; j<cabines.length; j++) {
                ant = j-1;
                prox = j+1;
                testes++;
                if(cabines[j] == numMax) {
                    found = true;
                    int[] newcabs = cabines.clone();
                    newcabs[j] = -1;
                    if(ant >=0) {
                        newcabs[ant]--;
                    }
                    if(prox<newcabs.length) {
                        newcabs[prox]--;
                    }
                    possib+=testa1(spies-1, newcabs, numMax);
                }
            }
            numMax--;
        }
        return possib;
        
    }
    
    public static int testa2(int spies, int[] cabines, int numMax) {
        int ant, prox;
        int possib = 0;
        
        //testando
        boolean found = false;
        while(numMax>=0 && !found) {
            for(int j=0; j<cabines.length; j++) {
                ant = j-1;
                prox = j+1;
                testes++;
                if(cabines[j] == numMax) {
                    if(spies == 1)
                        return 1;
                    
                    found = true;
                    int[] newcabs = cabines.clone();
                    newcabs[j] = -1;
                    if(ant >=0) {
                        newcabs[ant]--;
                    }
                    if(prox<newcabs.length) {
                        newcabs[prox]--;
                    }
                    possib+=testa2(spies-1, newcabs, numMax);
                }
            }
            numMax--;
        }
        return possib;
        
    }
    
    public static int testa3(int spies, int[] cabines, int numMax) {
        if(spies == 1)
            return 1;
        int ant, prox;
        int possib = 0;
        
        //testando
        boolean found = false;
        while(numMax>=0 && !found) {
            for(int j=0; j<cabines.length; j++) {
                ant = j-1;
                prox = j+1;
                testes++;
                if(cabines[j] == numMax) {
                    
                    found = true;
                    int[] newcabs = cabines.clone();
                    newcabs[j] = -1;
                    if(ant >=0) {
                        newcabs[ant]--;
                    }
                    if(prox<newcabs.length) {
                        newcabs[prox]--;
                    }
                    possib+=testa3(spies-1, newcabs, numMax);
                }
            }
            numMax--;
        }
        return possib;
        
    }
    
    public static int testa4(int spies, int[] cabines, int numMax) {
        if(spies == 1)
            return 1;
        int ant, prox;
        int possib = 0;
        
        //testando
        boolean found = false;
        while(numMax>=0 && !found) {
            for(int j=0; j<cabines.length; j++) {
                ant = j-1;
                prox = j+1;
                testes++;
                if(cabines[j] == numMax) {
                    
                    found = true;
                    int[] newcabs = cabines.clone();
                    newcabs[j] = -1;
                    if(ant >=0) {
                        newcabs[ant]--;
                    }
                    if(prox<newcabs.length) {
                        newcabs[prox]--;
                    }
                    possib+=testa4(spies-1, newcabs, numMax);
                }
            }
            numMax--;
        }
        return possib;
        
    }
    
    
}
