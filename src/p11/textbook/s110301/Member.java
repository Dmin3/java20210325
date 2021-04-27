package p11.textbook.s110301;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)){
				return true;
			}
		}
		return false;

	}
}
