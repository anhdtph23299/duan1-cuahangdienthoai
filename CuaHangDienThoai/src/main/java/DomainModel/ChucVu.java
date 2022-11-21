/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Empty;

/**
 *
 * @author ongbi
 */
    @Table(name = "ChucVu")
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Entity
public class ChucVu {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "Id")
   private UUID id;
   
   @Column(name = "Ma", unique = true)
   private String ma;
   
   @Column(name = "Ten",columnDefinition = "nvarchar(Max)")
   private String ten;
   
   @Column(name = "Luong")
   private BigDecimal Luong;
   
   @Column(name = "TrangThai")
   private int trangThai;
//   
//   @OneToMany(mappedBy = "chucVu", fetch = FetchType.LAZY)
//   private List<NhanVien> nhanVien;
//   
}
