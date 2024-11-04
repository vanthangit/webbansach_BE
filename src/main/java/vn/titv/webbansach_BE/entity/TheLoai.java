package vn.titv.webbansach_BE.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "the_loai")
public class TheLoai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_the_loai")
    private int maTheLoai;
    @Column(name = "ten_the_loai")
    private String tenTheLoai;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "sach_danhsachtheloai",
            joinColumns = @JoinColumn(name = "ma_the_loai"),
            inverseJoinColumns = @JoinColumn(name = "ma_sach")
    ) //quan hệ nhiều-nhiều => tạo ra table mới
    private List<Sach> danhSachQuyenSach;
}
