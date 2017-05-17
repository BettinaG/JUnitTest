package JUnitTest;

public class Board {

	String[][] fields;
	
	public Board(){
		
		fields = new String[3][3];
			
	}
	
	public void setMark(String mark, int x, int y) throws Exception{
		
		if(!mark.equalsIgnoreCase("X")){
			if(!mark.equalsIgnoreCase("O")) throw new Exception();
		}
		else if(x < 0 || x > 2) throw new Exception("Ungültige Position");
		else if(y < 0 || y > 2) throw new Exception("Ungültige Position");
		
		fields[x][y] = mark;
	}
	
	public boolean hasWinner(){
		if(fields[0][0] != null && fields[0][1] != null && fields[0][2] != null) return true;
		else if(fields[1][0] != null && fields[1][1] != null && fields[1][2] != null) return true;
		else if(fields[2][0] != null && fields[2][1] != null && fields[2][2] != null) return true;
		else if(fields[0][0] != null && fields[1][0] != null && fields[2][0] != null) return true;
		else if(fields[0][1] != null && fields[1][1] != null && fields[2][1] != null) return true;
		else if(fields[0][2] != null && fields[1][2] != null && fields[2][2] != null) return true;
		else if(fields[0][0] != null && fields[1][1] != null && fields[2][2] != null) return true;
		else if(fields[2][0] != null && fields[1][1] != null && fields[0][2] != null) return true;
		else return false;
	}
		
}
