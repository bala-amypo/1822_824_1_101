@Service
public class WarehouseImplementation implements WarehouseService{
  @Autowired
  WarehouseRepository obj;

  public warehouse createwarehouse(warehouse ware){
    return obj.save(ware);
  }
  public warehouse getwarehouse
}