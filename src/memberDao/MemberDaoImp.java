package memberDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import memberPojo.Member;

public class MemberDaoImp implements MemberDao
{

	@Override
	public boolean addMember(Member member)
	{
		int row=0;
    	Connection con=utility.DBUtility.connection();
    	String query="insert into TMember(Name,Surname,Contact,Address,Email,Gender,Age,GymTime,AdmissionFee,RegisteredDate) values(?,?,?,?,?,?,?,?,?,?)";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setString(1,member.getName());
    	    stmt.setString(2,member.getSurname());
    	    stmt.setString(3,member.getMobile());
    	    stmt.setString(4,member.getAddress());
    	    stmt.setString(5,member.getEmail());
    	    stmt.setString(6,member.getGender());
    	    stmt.setString(7,member.getAge());
    	    stmt.setString(8,member.getGymTime());
    	    stmt.setString(9,member.getAdmissionFee());
    	    stmt.setString(10,member.getDate());
    	    row=stmt.executeUpdate();
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	if(row>0)
    	   return true;
    	else
    	   return false;
	}

	@Override
	public boolean updateMember(Member member)
	{
		int row=0;
    	Connection con=utility.DBUtility.connection();
    	String query="update TMember set Name=?,Surname=?,Contact=?,Email=?,Gender=?,Age=?,GymTime=?,AdmissionFee=?,RegisteredDate=?,Address=? where MemberId=?";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setString(1,member.getName());
    	    stmt.setString(2,member.getSurname());
    	    stmt.setString(3,member.getMobile());
    	    stmt.setString(4,member.getEmail());
    	    stmt.setString(5,member.getGender());
    	    stmt.setString(6,member.getAge());
    	    stmt.setString(7,member.getGymTime());
    	    stmt.setString(8,member.getAdmissionFee());
    	    stmt.setString(9,member.getDate());
    	    stmt.setString(10,member.getAddress());
    	    stmt.setInt(11,member.getId());
    	    row=stmt.executeUpdate();
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	if(row>0)
    	   return true;
    	else
    	   return false;
	}

	@Override
	public boolean deleteMember(int memberId)
	{
		int row=0;
    	Connection con=utility.DBUtility.connection();
    	String query="delete from TMember where MemberId=?";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setInt(1,memberId);
    	    row=stmt.executeUpdate();
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	if(row>0)
    	   return true;
    	else
    	   return false;
	}

	@Override
	public Member getMemberById(int memberId)
	{
		ResultSet rs;
		Member m=null;
		String str="select * from tmember where memberId=?";
		Connection con=utility.DBUtility.connection();
		try
		{
			PreparedStatement stmt= con.prepareStatement(str);
			stmt=con.prepareStatement(str);
			stmt.setInt(1, memberId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				m=new Member();
				m.setId(rs.getInt("memberId"));
				m.setName(rs.getString("name"));
				m.setSurname(rs.getString("surname"));
				m.setMobile(rs.getString("contact"));
				m.setAddress(rs.getString("address"));
				m.setEmail(rs.getString("email"));
				m.setGender(rs.getString("gender"));
				m.setAge(rs.getString("age"));
				m.setGymTime(rs.getString("GymTime"));
				m.setAdmissionFee(rs.getString("admissionfee"));
				m.setDate(rs.getString("RegisteredDate"));
			}
		}
		
		catch(SQLException e)
      	{
      		e.printStackTrace();
      	}
		
		return m;

	}

}
