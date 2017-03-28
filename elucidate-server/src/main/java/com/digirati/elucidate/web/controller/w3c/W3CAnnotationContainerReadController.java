package com.digirati.elucidate.web.controller.w3c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digirati.elucidate.common.model.annotation.w3c.W3CAnnotation;
import com.digirati.elucidate.common.model.annotation.w3c.W3CAnnotationCollection;
import com.digirati.elucidate.common.model.annotation.w3c.W3CAnnotationPage;
import com.digirati.elucidate.service.query.W3CAnnotationCollectionService;
import com.digirati.elucidate.service.query.W3CAnnotationPageService;
import com.digirati.elucidate.service.query.W3CAnnotationService;
import com.digirati.elucidate.web.controller.AbstractAnnotationContainerReadController;

@RestController(W3CAnnotationContainerReadController.CONTROLLER_NAME)
@RequestMapping(value = "/w3c")
public class W3CAnnotationContainerReadController extends AbstractAnnotationContainerReadController<W3CAnnotation, W3CAnnotationPage, W3CAnnotationCollection> {

    public static final String CONTROLLER_NAME = "w3cAnnotationContainerReadController";

    @Autowired
    public W3CAnnotationContainerReadController(W3CAnnotationService w3cAnnotationService, W3CAnnotationPageService w3cAnnotationPageService, W3CAnnotationCollectionService w3cAnnotationCollectionService) {
        super(w3cAnnotationService, w3cAnnotationPageService, w3cAnnotationCollectionService);
    }
}
