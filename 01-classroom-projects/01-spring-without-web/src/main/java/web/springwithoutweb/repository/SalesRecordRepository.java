package web.springwithoutweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.springwithoutweb.model.SalesRecord;

public interface SalesRecordRepository extends JpaRepository<SalesRecord, Long> {

}
