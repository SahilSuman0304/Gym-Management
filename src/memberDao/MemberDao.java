package memberDao;

import memberPojo.Member;

public interface MemberDao
{
   public boolean addMember(Member member);
   public boolean updateMember(Member member);
   public boolean deleteMember(int memberId);
   public Member getMemberById(int memberId);
}
