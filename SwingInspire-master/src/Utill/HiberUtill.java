/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utill;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import DomainModel.BaoHanh;
import DomainModel.Ca;
import DomainModel.ChiTietKhuyenMai;
import DomainModel.ChucVu;
import DomainModel.Cong;
import DomainModel.DienThoai;
import DomainModel.DienThoaiNCC;
import DomainModel.Hang;
import DomainModel.HoaDon;
import DomainModel.HoaDonChiTiet;
import DomainModel.KhachHang;
import DomainModel.KhuyenMai;
import DomainModel.NhaCungCap;
import DomainModel.NhanVien;
import DomainModel.PhuKien;
import DomainModel.PhuKienNCC;
import DomainModel.TaiKhoan;


/**
 *
 * @author ongbi
 */
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
public class HiberUtill {
      
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=DuAn1");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123456");
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.HBM2DDL_AUTO, "none");

        conf.setProperties(properties);
        conf.addAnnotatedClass(BaoHanh.class);
        conf.addAnnotatedClass(Ca.class);
        conf.addAnnotatedClass(ChiTietKhuyenMai.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(Cong.class);
        conf.addAnnotatedClass(DienThoai.class);
        conf.addAnnotatedClass(DienThoaiNCC.class);
        conf.addAnnotatedClass(Hang.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(KhuyenMai.class);
        conf.addAnnotatedClass(NhaCungCap.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(PhuKien.class);
        conf.addAnnotatedClass(PhuKienNCC.class);
        conf.addAnnotatedClass(TaiKhoan.class);


        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
    
    public static void main(String[] args) {
        getFACTORY();
    }
}
