package vn.titv.webbansach_BE.dao;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;
import vn.titv.webbansach_BE.entity.DonHang;

@Repository
public interface DonHangRepository extends JpaAttributeConverter<DonHang, Integer> {
}
