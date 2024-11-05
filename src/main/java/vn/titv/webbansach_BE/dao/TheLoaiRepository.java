package vn.titv.webbansach_BE.dao;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;
import vn.titv.webbansach_BE.entity.TheLoai;

@Repository
public interface TheLoaiRepository extends JpaAttributeConverter<TheLoai, Integer> {
}
