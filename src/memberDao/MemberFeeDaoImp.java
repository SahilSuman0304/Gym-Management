package memberDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import memberPojo.MemberFee;

public class MemberFeeDaoImp implements MemberFeeDao
{

	@Override
	public boolean addFee(MemberFee fee)
	{
		int row=0;
    	Connection con=utility.DBUtility.connection();
    	String query="insert into MemberFee(MemberId,FromDate,ToDate,FeePaid,Date) values(?,?,?,?,?)";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setInt(1,fee.getId());
    	    stmt.setString(2,fee.getFrom());
    	    stmt.setString(3,fee.getTo());
    	    stmt.setString(4,fee.getFeePaid());
    	    stmt.setString(5,fee.getDate());
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

}
