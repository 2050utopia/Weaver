package weaver.toolkit.test.weaving.method;

/**
 * @author Saeed Masoumi (saeed@6thsolution.com)
 */
public class ParentActivity extends AncestorActivity {


    protected void onResume(Bundle bundle) {
        System.out.println("onResume in parentActivity");
    }
}
