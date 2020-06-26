package com.tju.data.Controller;

import com.tju.data.Mapper.PaperMapper;
import com.tju.data.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class ExampleController {
    @Autowired
    PaperMapper paperMapper;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public @ResponseBody RetResult<List> articleListResponse() {

        List<ArticleIndex> list = new ArrayList<>();

        ArticleIndex articleIndex = new ArticleIndex();
        articleIndex.setId("1");
        articleIndex.setTitle("KRAS 突变：史上最难靶点将成历史");
        articleIndex.setSource("肿瘤时间");
        list.add(articleIndex);

        ArticleIndex articleIndex1 = new ArticleIndex();
        articleIndex1.setId("2");
        articleIndex1.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex1.setSource("找药宝典");
        list.add(articleIndex1);

        ArticleIndex articleIndex2 = new ArticleIndex();
        articleIndex2.setId("3");
        articleIndex2.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex2.setSource("找药宝典");
        list.add(articleIndex2);

        ArticleIndex articleIndex3 = new ArticleIndex();
        articleIndex3.setId("4");
        articleIndex3.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex3.setSource("找药宝典");
        list.add(articleIndex3);

        ArticleIndex articleIndex4 = new ArticleIndex();
        articleIndex4.setId("5");
        articleIndex4.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex4.setSource("找药宝典");
        list.add(articleIndex4);

        ArticleIndex articleIndex5 = new ArticleIndex();
        articleIndex5.setId("6");
        articleIndex5.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex5.setSource("找药宝典");
        list.add(articleIndex5);

        ArticleIndex articleIndex6 = new ArticleIndex();
        articleIndex6.setId("7");
        articleIndex6.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex6.setSource("找药宝典");
        list.add(articleIndex6);

        ArticleIndex articleIndex7 = new ArticleIndex();
        articleIndex7.setId("8");
        articleIndex7.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex7.setSource("找药宝典");
        list.add(articleIndex7);

        ArticleIndex articleIndex8 = new ArticleIndex();
        articleIndex8.setId("9");
        articleIndex8.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex8.setSource("找药宝典");
        list.add(articleIndex8);

        ArticleIndex articleIndex9 = new ArticleIndex();
        articleIndex9.setId("10");
        articleIndex9.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex9.setSource("找药宝典");
        list.add(articleIndex9);

        ArticleIndex articleIndex10 = new ArticleIndex();
        articleIndex10.setId("11");
        articleIndex10.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex10.setSource("找药宝典");
        list.add(articleIndex10);

        ArticleIndex articleIndex11 = new ArticleIndex();
        articleIndex11.setId("12");
        articleIndex11.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex11.setSource("找药宝典");
        list.add(articleIndex11);

        ArticleIndex articleIndex12 = new ArticleIndex();
        articleIndex12.setId("13");
        articleIndex12.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex12.setSource("找药宝典");
        list.add(articleIndex12);

        ArticleIndex articleIndex13 = new ArticleIndex();
        articleIndex13.setId("14");
        articleIndex13.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex13.setSource("找药宝典");
        list.add(articleIndex13);

        ArticleIndex articleIndex14 = new ArticleIndex();
        articleIndex14.setId("15");
        articleIndex14.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex14.setSource("找药宝典");
        list.add(articleIndex14);

        ArticleIndex articleIndex15 = new ArticleIndex();
        articleIndex15.setId("16");
        articleIndex15.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex15.setSource("找药宝典");
        list.add(articleIndex15);

        ArticleIndex articleIndex16 = new ArticleIndex();
        articleIndex16.setId("17");
        articleIndex16.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex16.setSource("找药宝典");
        list.add(articleIndex16);

        ArticleIndex articleIndex17 = new ArticleIndex();
        articleIndex17.setId("18");
        articleIndex17.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex17.setSource("找药宝典");
        list.add(articleIndex17);

        ArticleIndex articleIndex18 = new ArticleIndex();
        articleIndex18.setId("19");
        articleIndex18.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex18.setSource("找药宝典");
        list.add(articleIndex18);


        ArticleIndex articleIndex19 = new ArticleIndex();
        articleIndex19.setId("20");
        articleIndex19.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex19.setSource("找药宝典");
        list.add(articleIndex19);

        ArticleIndex articleIndex20 = new ArticleIndex();
        articleIndex20.setId("21");
        articleIndex20.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex20.setSource("找药宝典");
        list.add(articleIndex20);

        ArticleIndex articleIndex21 = new ArticleIndex();
        articleIndex21.setId("22");
        articleIndex21.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex21.setSource("找药宝典");
        list.add(articleIndex21);

        ArticleIndex articleIndex22 = new ArticleIndex();
        articleIndex22.setId("23");
        articleIndex22.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex22.setSource("找药宝典");
        list.add(articleIndex22);

        ArticleIndex articleIndex23 = new ArticleIndex();
        articleIndex23.setId("24");
        articleIndex23.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex23.setSource("找药宝典");
        list.add(articleIndex23);

        ArticleIndex articleIndex24 = new ArticleIndex();
        articleIndex24.setId("25");
        articleIndex24.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex24.setSource("找药宝典");
        list.add(articleIndex24);

        ArticleIndex articleIndex25 = new ArticleIndex();
        articleIndex25.setId("26");
        articleIndex25.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex25.setSource("找药宝典");
        list.add(articleIndex25);

        ArticleIndex articleIndex26 = new ArticleIndex();
        articleIndex26.setId("27");
        articleIndex26.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex26.setSource("找药宝典");
        list.add(articleIndex26);

        ArticleIndex articleIndex27 = new ArticleIndex();
        articleIndex27.setId("28");
        articleIndex27.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex27.setSource("找药宝典");
        list.add(articleIndex27);

        ArticleIndex articleIndex28 = new ArticleIndex();
        articleIndex28.setId("29");
        articleIndex28.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex28.setSource("找药宝典");
        list.add(articleIndex28);

        ArticleIndex articleIndex29 = new ArticleIndex();
        articleIndex29.setId("30");
        articleIndex29.setTitle("KRAS综述：不可成药靶点的一路成败与现状!");
        articleIndex29.setSource("找药宝典");
        list.add(articleIndex29);


//        List<PaperMysqlBean> list = paperMapper.getData();
        return RetResponse.makeOKRsp(list);
    }

    @RequestMapping(value = "/news",method = RequestMethod.POST)
    public String searchListResponse(@RequestBody Map<String, String> map) {
        System.out.println(map.get("id"));
        return "2.html";

//        return String.format("%s.html", map.get("id"));
    }

}
