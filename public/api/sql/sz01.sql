-- left join 获取一条数据
-- tb_goods 和 tb_attachment 是一对多的关系，tb_goods_img是中间表
select *
from tb_goods a
         left join tb_attachment d on d.id = (
    select c.attachment_id from tb_goods_img c where c.goods_id = a.id order by id limit 1
)
