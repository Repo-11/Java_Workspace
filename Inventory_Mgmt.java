package Inventory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Inventory_Mgmt {
    private String invDb[][];
    private int itemCount;
    private final int RF_ID;
    private final int itemName;
    private final int itemModNo;
    private final int itemPrice;
    private final int itemWarr;
    private final int itemPowerCons;
    private final int maxCol;
    private final BufferedReader br;
    private int chFMain;
    
    public Inventory_Mgmt(){
        RF_ID=0;
        itemName=1;
        itemModNo=2;
        itemPrice=3;
        itemWarr=4;
        itemPowerCons=5;
        itemCount=0;
        invDb=new String[100][10];
        maxCol=6;
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void viewMainPage(){
        System.out.println("You can do the following works :");
        System.out.println("1.Add new items");
        System.out.println("2.View product details");
        System.out.println("3.View whole inventory detail");
        System.out.println("9.Exit");
    }
    
    public int takeInputFromMain(){
        System.out.println("Enter your choice");
        try
        {
            chFMain=Integer.parseInt(br.readLine());
            if(chFMain==1||chFMain==2||chFMain==3||chFMain==9)
                return 1;
            else
                return -1;
        }
        catch(IOException|NumberFormatException ex)
        {
            return 0;
        }
    }
    
    public void takeActions()throws IOException{
        switch(chFMain)
        {
            case 1:
                addNewItem();
                break;
            case 2:
                viewDetails();
                break;
            case 3:
                viewWholeInv();
                break;
            case 9:
                System.exit(1);
        }
    }
    
    public void addNewItem()throws IOException{
        String ch;
        do
        {            
            System.out.println("Enter RFID of item");
            invDb[itemCount][RF_ID]=br.readLine();
            System.out.println("Enter item name");
            invDb[itemCount][itemName]=br.readLine();
            System.out.println("Enter its model no.");
            invDb[itemCount][itemModNo]=br.readLine();
            System.out.println("Enter its price");
            invDb[itemCount][itemPrice]=br.readLine();
            System.out.println("Enter its warranty period");
            invDb[itemCount][itemWarr]=br.readLine();
            System.out.println("Enter its power consumption");
            invDb[itemCount][itemPowerCons]=br.readLine();
            itemCount++;
            System.out.println("Entry successful");
            System.out.println("Do you want to continue?");
            ch=br.readLine();
            if(ch.equalsIgnoreCase("n"))
                break;
        }while(true);
    }
    
    public void viewDetails() throws IOException{
        String rfid,ch;
        int i;
        do{
            System.out.println("Enter RFID of item to search");
            rfid=br.readLine();
            for(i=0;i<itemCount;i++)
            {
                if(invDb[i][RF_ID].compareTo(rfid)==0)
                {
                    System.out.println("Item name :"+invDb[i][itemName]);
                    System.out.println("RFID :"+invDb[i][RF_ID]);
                    System.out.println("Model no. :"+invDb[i][itemModNo]);
                    System.out.println("Price :"+invDb[i][itemPrice]);
                    System.out.println("Warranty period :"+invDb[i][itemWarr]);
                    System.out.println("Power consumption :"+invDb[i][itemPowerCons]);
                }
            }
            System.out.println("Do you want to continue?");
            ch=br.readLine();
            if(ch.equalsIgnoreCase("n"))
                break;
        }while(true);
    }
    public void viewWholeInv()
    {
        int i;
        System.out.println("The whole inventory details are :");
        for(i=0;i<itemCount;i++)
        {
            System.out.println("Item name :"+invDb[i][itemName]);
            System.out.println("RFID :"+invDb[i][RF_ID]);
            System.out.println("Model no. :"+invDb[i][itemModNo]);
            System.out.println("Price :"+invDb[i][itemPrice]);
            System.out.println("Warranty period :"+invDb[i][itemWarr]);
            System.out.println("Power consumption :"+invDb[i][itemPowerCons]+"\n");
        }
    }
    
    public void go()throws IOException{
        while(true)
        {
            viewMainPage();
            while(takeInputFromMain()==-1){
                System.out.println("Wrong input");
            }
            takeActions();
        }
    }
    
    public static void main(String args[])throws IOException{
        Inventory_Mgmt ob=new Inventory_Mgmt();
        ob.go();
        
    }
    
}