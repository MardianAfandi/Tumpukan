/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mardian Afandi
 */
class ProgamTumpukan {
    static int atas = -1;
    static int batasAtas = 9;
    
    public static void push(String tumpukan[], String data)
    {
        if (atas >= batasAtas)
            System.out.println("Tumpukan Penuh");
        else
        {
            System.out.println("Push    : " + data);
            atas = atas + 1;
            tumpukan[atas] = data;
        }
    }
    public static String pop (String tumpukan[])
    {
        String hasilPop = " ";
        if (atas < 0)
            hasilPop = "Tumpukan Kosong";
        else
        {
            hasilPop = tumpukan [atas];
            tumpukan [atas] = null;
            atas--;
        }
        return (hasilPop);
    }
    
    public static void bacaTumpukan(String tumpukan[])
    {
        System.out.println("Kondisi Tumpukan    : ");
        for (int i = batasAtas; i >= 0; i--)
        {
            if(i == atas)
                System.out.println(i + "." + tumpukan[i] + " atas");
            else
                System.out.println(i + "." + tumpukan[i]);
        }
    }
    
    public static void hapusTumpukan(String tumpukan[])
    {
        for (int i = batasAtas; i >= 0; i--)
        {
            if (i >= 0)
            {
                tumpukan[i] = null;
            }
        }
        atas = -1;
    }
            
            
    public static void main (String args[])
    {
        String tumpukan[] = new String[10];
        push(tumpukan, "Buku A");
        push(tumpukan, "Buku B");
        push(tumpukan, "Buku C");
        push(tumpukan, "Buku D");
        System.out.println();
        bacaTumpukan(tumpukan);
        
        System.out.println();
        push(tumpukan, "Buku E");
        push(tumpukan, "Buku F");
        push(tumpukan, "Buku G");
        System.out.println();
        bacaTumpukan(tumpukan);
        
        System.out.println();
        push(tumpukan, "Buku H");
        push(tumpukan, "Buku I");
        push(tumpukan, "Buku J");
        push(tumpukan, "Buku K");
        push(tumpukan, "Buku L");
        System.out.println();
        bacaTumpukan(tumpukan);
        
        System.out.println();
        System.out.println("POP : " + pop(tumpukan));
        bacaTumpukan(tumpukan);
        
        System.out.println();
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        bacaTumpukan(tumpukan);
        
        System.out.println();
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        System.out.println("POP : " + pop(tumpukan));
        bacaTumpukan(tumpukan);
        
        hapusTumpukan(tumpukan);
        bacaTumpukan(tumpukan);
    }
}
