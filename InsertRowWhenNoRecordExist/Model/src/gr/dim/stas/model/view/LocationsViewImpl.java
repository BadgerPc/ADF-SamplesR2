package gr.dim.stas.model.view;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 19 14:19:25 GMT 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LocationsViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public LocationsViewImpl() {
    }

    protected void executeQueryForCollection(Object object, Object[] object2, int i) {
        super.executeQueryForCollection(object, object2, i);
        if(this.first()==null){
            Row createRow = this.createRow();
            this.insertRow(createRow);
            this.setCurrentRow(createRow);
        }
    }
}
