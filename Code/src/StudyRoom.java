public class StudyRoom {
    private int roomNumber;
    private boolean isReserved;
    private int reservedByMemberID;

    StudyRoom(){
        roomNumber=0;
        isReserved=false;
        reservedByMemberID=0;

    }
    StudyRoom(int roomNumber,boolean isReserved,int reservedByMemberID){
        this.roomNumber=roomNumber;
        this.isReserved=isReserved;
        this.reservedByMemberID=reservedByMemberID;

    }


    void reserveRoom(int reservedByMemberID){

    }
    void cancelReservation(){

    }
    void displayRoomStatus(){
        if(isReserved){
            System.out.println("The room " + roomNumber + "is already reserved by member " + reservedByMemberID);
        }
        else{
            System.out.println("The room " + roomNumber + "is  available");
        }

    }
     boolean isReserved(){
        return isReserved;

    }
    int getRoomNumber(){
        return roomNumber;

    }
    int getReservedByMemberID(){
        return reservedByMemberID;

    }
}
