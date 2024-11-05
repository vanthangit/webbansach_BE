package vn.titv.webbansach_BE.dao;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;
import vn.titv.webbansach_BE.entity.HinhThucThanhToan;

@Repository
public interface HinhThucThanhToanRepository extends JpaAttributeConverter<HinhThucThanhToan, Integer> {
}
