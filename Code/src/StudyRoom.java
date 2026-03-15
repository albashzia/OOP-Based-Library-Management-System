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

}
