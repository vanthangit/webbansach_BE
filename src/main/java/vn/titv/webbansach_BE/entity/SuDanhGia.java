package vn.titv.webbansach_BE.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "su_danh_gia")
public class SuDanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_danh_gia")
    private long maDanhGia;
    @Column(name = "diem_xep_hang")
    private float diemXepHang;
    @Column(name = "nhan_xet")
    private String nhanXet;
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
