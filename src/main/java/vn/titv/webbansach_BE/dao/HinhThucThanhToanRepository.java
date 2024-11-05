package vn.titv.webbansach_BE.dao;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.titv.webbansach_BE.entity.HinhThucThanhToan;

@RepositoryRestResource(path = "hinh-thuc-thanh-toan")
public interface HinhThucThanhToanRepository extends JpaRepository<HinhThucThanhToan, Integer> {
}
