package org.trashacker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/23
 */
@RestController
public class TrashClassificationController {

    private static final String API_ENDPOINT = "http://data.taipei/opendata/datalist/apiAccess?scope=resourceAquire&rid=5ca550ce-6fd9-4a90-b230-bddc88f1133d";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET, value = "/trash/classification")
    String searchByKeyword(@RequestParam("q") String keyword) throws Exception {
        return restTemplate.getForObject(API_ENDPOINT + "&q=" + keyword, String.class);
    }
}
