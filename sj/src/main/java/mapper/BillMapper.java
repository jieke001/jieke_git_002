package mapper;

import entity.Bill;
import entity.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//订单mapper接口代理
public interface BillMapper {

    //根据商品名称模糊查询、供应商id、是否支付查询订单表信息
    public Bill billByName(@Param("productName")String name, @Param("providerId") int id, @Param("isPayment") int isPayment);

    //根据商品名称模糊查询、供应商id、是否支付，查询订单表信息与供应商表信息
    public Bill billByNaIdIsPayment(Bill bill);

    //根据订单编码（模糊查询）和指定的供应商列表（1~n个），获取相应的订单列表信息
    public List<Bill> billByCodeAndProId(Map<String,Object> billMap);

    //查询订单表总记录数
    public int count();

    //订单表分页查询
    public List<Bill> billLimit(@Param("currentPageNo") int currentPageNo,@Param("pageSize")int pageSize);

}
