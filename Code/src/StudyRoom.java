public class StudyRoom {
    private int roomNumber;
    private boolean isReserved;
    private int reservedByMemberID;

    StudyRoom(){
        roomNumber=0;
        isReserved=false;
        reservedByMemberID=0;
    }
    StudyRoom(int roomNumber){
        this.roomNumber=roomNumber;
        this.isReserved=false;
        this.reservedByMemberID=0;

    }
    StudyRoom(int roomNumber,boolean isReserved,int reservedByMemberID){
        this.roomNumber=roomNumber;
        this.isReserved=isReserved;
        this.reservedByMemberID=reservedByMemberID;
    }

 // room reservation method
    public void reserveRoom(String memberID){
        if(!isReserved){
            isReserved=true;
            reservedByMemberID=Integer.parseInt(memberID);
            System.out.println("Room is reserved");
        }
        else{
            System.out.println("Room is already reserved");
        }
    }
    //cancel reservation method
    public void cancelReservation(){
        if(isReserved){
            isReserved=false;
            reservedByMemberID=0;
            System.out.println("Reservation of room is cancelled");
        }
        else{
            System.out.println("Room is not reserved");
        }
    }
    // displaying all room status

    public void displayRoomStatus() {
        boolean reserved=isReserved();
        System.out.println("Room " + roomNumber + "| Reserved : " + reserved +
                (reserved ? "| By Member ID : " +reservedByMemberID:"") );
    }

    public boolean isReserved(){

        return isReserved;

    }

    public int getRoomNumber(){

        return roomNumber;

    }

    public int getreservedByMemberID()
    {
        return reservedByMemberID;
    }
}