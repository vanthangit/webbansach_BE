package vn.titv.webbansach_BE.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="sach_yeu_thich")
public class SachYeuThich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach_yeu_thich")
    private int maSachYeuThich;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "ma_sach", nullable = false) //bảng nhiều chứa id của bảng một => khóa ngoại
    private Sach sach;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "ma_nguoi_dung", nullable = false) //bảng nhiều chứa id của bảng một => khóa ngoại
    private NguoiDung nguoiDung;

}
