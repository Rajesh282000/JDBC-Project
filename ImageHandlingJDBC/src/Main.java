import java.io.*;
import java.sql.*;

public class Main {
    private static final  String url ="jdbc:mysql://localhost:3306/ jdbcp1";
    private static final String username = "root";
    private static final String password = "12345";
   // static String imagePath = "C:\\Users\\hp\\OneDrive\\Pictures\\canon 700\\RajeshBurnwal.jpg";
    //static String query ="Insert into image_table(image_data)values(?);";
    static String folderPath = "C:\\Users\\hp\\OneDrive\\Pictures\\canon 700\\";
    static String query = "select image_data from image_table where image_id =(?)";



    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("loaded");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,1);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                byte[] image_data = rs.getBytes("image_data");
                String image_path = folderPath+"RajeshBurnwal.jpg";
                OutputStream ops = new FileOutputStream(image_path);
                ops.write(image_data);

            }else{
                System.out.println("Image not found");
            }


           /* this code use for execution purpose
           FileInputStream fis= new FileInputStream(imagePath);
            byte[] imageData = new byte[fis.available()];
            fis.read(imageData);

            PreparedStatement ps = con.prepareStatement(query);
            ps.setBytes(1,imageData);


            int rowAffected = ps.executeUpdate();

            if(rowAffected > 0 ){
                System.out.println(rowAffected+" row(S) effected");
            }else{
                System.out.println("row(s) not affected."+"\n give valid query");
            }
*/




        }catch (SQLException e){
            System.out.println(e.getMessage());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}