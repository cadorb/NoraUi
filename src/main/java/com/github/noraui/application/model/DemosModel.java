/**
 * NoraUi is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 * 
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.github.noraui.application.model;

import java.util.ArrayList;

import com.github.noraui.model.ModelList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @deprecated since NoraUi 3.3.0, because DemosModel renamed to CommonModels.
 *             {@link com.github.noraui.application.model.CommonModels<T>} instead.
 */
@Deprecated
public abstract class DemosModel<T> extends ArrayList<T> implements ModelList {

    /**
     *
     */
    private static final long serialVersionUID = 257533336402277981L;

    protected DemosModel() {
        super();
    }

    protected DemosModel(DemosModel<T> inputList) {
        super(inputList);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String serialize() {
        final GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        builder.disableHtmlEscaping();
        final Gson gson = builder.create();
        return gson.toJson(this);
    }

}
