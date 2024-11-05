package vn.titv.webbansach_BE.dao;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.titv.webbansach_BE.entity.ChiTietDonHang;

@RepositoryRestResource(path = "chi-tiet-don-hang")
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Long> {
}
