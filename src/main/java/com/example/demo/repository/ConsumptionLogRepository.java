public interface ConsumptionLogRepository extends JpaRepository<ConsumptionLog, Long> {
    List<ConsumptionLog> findByStockRecordIdAndConsumedDateBetween(
            Long id, LocalDate start, LocalDate end);

    List<ConsumptionLog> findByStockRecordIdOrderByConsumedDateDesc(Long id);
}
