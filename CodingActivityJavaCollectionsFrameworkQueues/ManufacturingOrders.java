// PROGRAMMER

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.io.PrintWriter;

public class ManufacturingOrders
{
    // INSTANCE VARIABLES
    private Queue<Vehicle> manufacturingOrderQueue;
    
    // CONSTRUCTORS
    public ManufacturingOrders()
    {
        manufacturingOrderQueue = new LinkedList<Vehicle>();
    }
    
    public ManufacturingOrders(String filename) throws IOException
    {
        manufacturingOrderQueue = new LinkedList<Vehicle>();
        
        Scanner fileInput = new Scanner(new File(filename));
        
        while(fileInput.hasNext())
        {
            Vehicle vehicle1 = new Vehicle(fileInput.nextLine(), fileInput.nextLine(), fileInput.nextLine());
            manufacturingOrderQueue.offer(vehicle1);
        }
    }
    
    // INSTANCE METHODS
    public void newOrderPlaced(String customer, String carModel, String color)
    {
        if(customer == "" || carModel == "" || color != "")
        {
            throw new IllegalArgumentException("Invalid Order: can not add order to the manufacturing queue");
        }
        else
        {
            Vehicle vehicle1 = new Vehicle(customer, carModel, color);
            manufacturingOrderQueue.offer(vehicle1);
        }
    }
    
    public void newOrderPlaced(Vehicle order)
    {
        if(order.getCustomer() == "" || order.getCarModel() == "" || order.getColor() == "")
        {
            throw new IllegalArgumentException("Invalid Order: can not add order to the manufacturing queue");
        }
        else
        {
            manufacturingOrderQueue.offer(order);
        }
    }
    
    public Vehicle orderShipped()
    {
        if(manufacturingOrderQueue.peek() == null)
        {
            throw new RuntimeException("Empty queue: no order is currently being worked on");
        }
        else
        {
            return manufacturingOrderQueue.poll();
        }
    }
    
    public Vehicle workInProgress()
    {
        if(manufacturingOrderQueue.peek() == null)
        {
            throw new RuntimeException("Empty queue: no order is currently being worked on");
        }
        else
        {
            return manufacturingOrderQueue.peek();
        }
    }
    
    public int save(String filename) throws IOException
    {
        int numOrdersSaved = 0;
        
        PrintWriter fileWriter = new PrintWriter(filename);
        
        Queue<Vehicle> savedOrderQueue = new LinkedList<Vehicle>();
        
        while(manufacturingOrderQueue.peek() != null)
        {
            savedOrderQueue.offer(manufacturingOrderQueue.poll());
        }
        
        while(savedOrderQueue.peek() != null)
        {   
            fileWriter.println(savedOrderQueue.peek().getCustomer());
            fileWriter.println(savedOrderQueue.peek().getCarModel());
            fileWriter.println(savedOrderQueue.peek().getColor());
            
            manufacturingOrderQueue.offer(savedOrderQueue.poll());
            
            numOrdersSaved++;
        }
        
        fileWriter.close();
        
        return numOrdersSaved;
    }
}