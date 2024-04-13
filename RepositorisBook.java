package repositoris;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.DBConnect;
import model.Book;

public class RepositorisBook {

    public ArrayList<Book> welcomSa() {
        String sql = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where UserName='sa'";
        ArrayList<Book> listSa = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                
                listSa.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSa;
    }
    
    public ArrayList<Book> welcomAn() {
        String sql = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where UserName='an'";
        ArrayList<Book> listAn = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                listAn.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAn;
    }
    
    public ArrayList<Book> welcomNam() {
        String sql = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where UserName='nam'";
        ArrayList<Book> listNam = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                listNam.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNam;
    }

    public ArrayList<Book> searchBookSa(String searchBookSa) {
        String title = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where title like ? and  UserName ='sa' ";
        String book_id = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where book_id like ? and  UserName ='sa' ";
        String authors = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where book_id Authors.au_name ? and  UserName ='sa' ";
        ArrayList<Book> list = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(authors)){
            ps.setString(1, "%" + searchBookSa + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                list.add(b);
            }
        } catch (Exception e) {
        }
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(book_id)){
            ps.setString(1, "%" + searchBookSa + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                list.add(b);
            }
        } catch (Exception e) {
        }
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(title)) {
            ps.setString(1, "%" + searchBookSa + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                b.setTitle(rs.getString("title"));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Book> searchBookNam(String searchBookNam) {
        String title = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where title like ? and  UserName ='nam' ";
        String book_id = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where book_id like ? and  UserName ='nam' ";
        String authors = "select book_id,title ,Publishers.pub_name,Authors.au_name,notes "
                    + "from Books "
                    + "join Publishers on Books.pub_id = Publishers.pub_id "
                    + "join Authors on Books.au_id = Authors.au_id where book_id Authors.au_name ? and  UserName ='nam' ";
        ArrayList<Book> list = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(authors)){
            ps.setString(1, "%" + searchBookNam + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                list.add(b);
            }
        } catch (Exception e) {
        }
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(book_id)){
            ps.setString(1, "%" + searchBookNam + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                list.add(b);
            }
        } catch (Exception e) {
        }
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(title)) {
            ps.setString(1, "%" + searchBookNam + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                b.setTitle(rs.getString("title"));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Book> searchBookAn(String searchBookAn) {
        String title = "select book_id,title,Publishers.pub_name,Authors.au_name,notes from Books join Publishers on Books.pub_id=Publishers.pub_id join Authors on Books.au_id = Authors.au_id where title like ? and UserName = 'an'";
        String book_id = "select book_id,title,Publishers.pub_name,Authors.au_name,notes from Books join Publishers on Books.pub_id=Publishers.pub_id join Authors on Books.au_id = Authors.au_id where book_id like ? and UserName = 'an' ";
        String authors = "select book_id,title,Publishers.pub_name,Authors.au_name,notes from Books join Publishers on Books.pub_id=Publishers.pub_id join Authors on Books.au_id = Authors.au_id where Authors.au_name like ? and UserName = 'an'";
        ArrayList<Book> list = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(authors)){
            ps.setString(1, "%" + searchBookAn + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                list.add(b);
            }
        } catch (Exception e) {
        }
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(book_id)){
            ps.setString(1, "%" + searchBookAn+ "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                list.add(b);
            }
        } catch (Exception e) {
        }
        try (Connection con = DBConnect.getConnection(); 
                    PreparedStatement ps = con.prepareStatement(title)) {
            ps.setString(1, "%" + searchBookAn + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBook_id(rs.getString("book_id"));
                b.setTitle(rs.getString("title"));
                b.setPub(rs.getString("pub_name"));
                b.setAu(rs.getString("au_name"));
                b.setNotes(rs.getString("notes"));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
