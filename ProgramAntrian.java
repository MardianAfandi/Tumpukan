/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mardian Afandi
 */
public class ProgramAntrian {
    static int ekor = -1;
    static int maxEkor = 9;
    
    public static void addQueue(String antrian[], String data)
    {
        if (ekor >= maxEkor)
        {
            System.out.println("Antrian Penuh");
        }
        else
        {
            System.out.println("addQueue    : " + data);
            ekor++;
            antrian[ekor] = data;
        }
    }
    
    public static String deQueue(String antrian[])
    {
        String hasil = " ";
        if (ekor < 0)
        {
            hasil = "Antrian Kosong";
        }
        else
        {
            hasil = antrian[0];
            antrian[0] = null;
            for(int i = 1; i <= ekor; i++)
            {
                antrian[i-1] = antrian[i];
                antrian[i] = null;
            }
            ekor--;
        }
        return (hasil);
    }
    
    public static void bacaAntrian(String antrian[])
    {
        System.out.println("Kondisi  Antrian    : ");
        for (int i = 0; i <=maxEkor; i++)
        {
            if (i == ekor)
                System.out.println((i+1) + "." + antrian[i] + " ekor");
            else
                System.out.println((i+1) + "." + antrian[i]);
        }
    }
    
     public static void hapus(String antrian[])
    {
        for (int i = maxEkor; i >= 0; i--)
        {
            if (i >= 0)
            {
                antrian[i] = null;
            }
        }
        ekor = -1;
    }
    
    public  static void main(String args[])
    {
        String antrian[] = new String[100];
        addQueue (antrian, "Mobil A");
        addQueue (antrian, "Mobil B");
        addQueue (antrian, "Mobil C");
        addQueue (antrian, "Mobil D");
        System.out.println();
        bacaAntrian(antrian);
        System.out.println();
        addQueue (antrian, "Mobil E");
        addQueue (antrian, "Mobil F");
        addQueue (antrian, "Mobil G");
        System.out.println();
        bacaAntrian(antrian);
        System.out.println();
        addQueue (antrian, "Mobil H");
        addQueue (antrian, "Mobil I");
        addQueue (antrian, "Mobil J");
        addQueue (antrian, "Mobil K");
        addQueue (antrian, "Mobil L");
        System.out.println();
        bacaAntrian(antrian);
        System.out.println();
        System.out.println("deQueue : " + deQueue(antrian));
        bacaAntrian(antrian);
        System.out.println();
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        bacaAntrian(antrian);
        System.out.println();
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        System.out.println("deQueue : " + deQueue(antrian));
        bacaAntrian(antrian);
        
        
        hapus(antrian);
        bacaAntrian(antrian);
    }
}