/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ongbi
 */
@Table(name = "NhaCungCap")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class NhaCungCap {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdNCC")
    private UUID id;
    
    @Column(name = "MaNCC", unique = true)
    private String ma;
    
    @Column(name = "DiaChi",columnDefinition = "nvarchar(Max)")
    private String diaChi;
    
    @Column(name = "TenNhaCC",columnDefinition = "nvarchar(Max)")
    private String ten;
    
    @Column(name = "SDT")
    private String sdt;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "TrangThai")
    private int trangThai;
    
}
