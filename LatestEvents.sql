select row1.event_type , row1.value -row2.value
    from    (select r.event_type, r.value
             from   (SELECT   ROW_NUMBER() OVER (PARTITION BY e.event_type ORDER BY time Desc) AS group_id,e.*
                    from (SELECT  e.event_type 
                          from events e 
                          group by e.event_type
                          having count(e.event_type)>=2 
                          ) g --get more than equals two records
                          left join events e on g.event_type= e.event_type 
                          order by e.event_type
                    )r 
             where r.group_id =1
            )row1--get first records in each groups
       join 
            (select r.event_type, r.value
             from   (SELECT   ROW_NUMBER() OVER (PARTITION BY e.event_type ORDER BY time Desc) AS group_id,e.*
                    from (SELECT  e.event_type 
                          from events e 
                          group by e.event_type
                          having count(e.event_type)>=2 
                          ) g --get more than equals two records
                          left join events e on g.event_type= e.event_type 
                          order by e.event_type
                    )r 
             where r.group_id =2
            )row2--get Second records in each groups
        on row1.event_type= row2.event_type