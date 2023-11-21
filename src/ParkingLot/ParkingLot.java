import java.util.*;


enum VehicleType{
  
  TWO_WHEELER, THREE_WHEELER, FOUR_WHEELER; 
  
}


class Floor{
  
  int id;
  Map<VehicleType , Set<ParkingSlot> slots = new HasMap();
  
  void addSlot(ParkingSlot slot){
    
    slots.add(slot.vehicleType, slot);
    
    
  }
  ParkingSlot getSlot(VehicleType type){
    
    if (slot.get(type) == null or slot.get(type).size()==0 ){
      
      return null
    }
    //thereis no arbitrary popping in set in java , unlike python
    return slot.get(type).iterator().remove();
    
    
  }
  
  void display(){
    
    for(VehicleType type: VehicleType.keySet()){
       System.out.println(type + " " slots.get(type).size());
    }
    
   
    
  }
}


class ParkingManager{
  
 
  
}

class ParkingLot{
  int id;
  Address address; 
  Set<Floor> floor ;
  
  ParkingLot()
}

//builder pattern
class Address{
  String city , zip;
  Address(Builder builder){
    this.city = builder.city;
    this.zip  = builder. zip;
  }
  static Builder class{
      String city , zip;
      
      Builder City(String city){
        this.city = city
        return this;
      }
      Builder Zip(String zip){  
        
        this.zip = zip;
        return this;
      }
      Address build(){
        return new Address(this);
      }
  
}


class Vehicle{
  
  int vehicleNumber;
  VehicleType type;
  
  Vehicle(int vehicleNumber, VehicleType type){
    
    this.vehicleNumber = vehicleNumber;
    this.vehicleType  = type
  }
  
  
} 


class Ticket{
  
   int ticketId;
  Date  issuedAt;
  Date exitAt;
  Parking slot;
  
  Ticket( int id, Date issuedAt, slot){
    this.ticketId = id;
    this.issuedAt= issuedAt;
    this.slot = slot;
  }
  
  
}


class Gate{
  int id ;
  Address address;
  ParkingManager manager;
  Gate(int id, Address address,ParkingManager manager){
    this.id  = id ;
    this.address = address;
    this.manager =manager
    
  }
}

class ExitGate extends Gate{
  
  ExitGat(int id, Address address,ParkingManager manager){
    super( id,address,manager))
  }
  static int id =0;
  ParkingSlot checkAvailability(vehicleType){
    
    ParkingSlot slot= manager.getSlot();
    
    
  
  }
  Ticket issueTicket(){
    if( checkAvailability!=null){
      id+=1;
      Ticket(id, new Date(),slot)
    }
    else{
      System.out.println("the lot is full")
    }
  }
  
  
}

class EntryGate extends Gate{
  
  
  ExitGate(int id, Address address,ParkingManager manager){
    super( id,address,manager))
  }
  void processPayment(Ticket ticket){
    System.out.println("Processed)
  }
  
  
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
  }
}
