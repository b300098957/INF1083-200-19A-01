/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.tns.gen.androidx.fragment.app;

public class DialogFragment_vendor_99863_32_DialogFragmentImpl
    extends androidx.fragment.app.DialogFragment implements com.tns.NativeScriptHashCodeProvider {
  public DialogFragment_vendor_99863_32_DialogFragmentImpl() {
    super();
    com.tns.Runtime.initInstance(this);
  }

  public android.app.Dialog onCreateDialog(android.os.Bundle param_0) {
    java.lang.Object[] args = new java.lang.Object[1];
    args[0] = param_0;
    return (android.app.Dialog)
        com.tns.Runtime.callJSMethod(this, "onCreateDialog", android.app.Dialog.class, args);
  }

  public void onDismiss(android.content.DialogInterface param_0) {
    java.lang.Object[] args = new java.lang.Object[1];
    args[0] = param_0;
    com.tns.Runtime.callJSMethod(this, "onDismiss", void.class, args);
  }

  public void onStart() {
    java.lang.Object[] args = new java.lang.Object[0];
    com.tns.Runtime.callJSMethod(this, "onStart", void.class, args);
  }

  public android.view.View onCreateView(
      android.view.LayoutInflater param_0,
      android.view.ViewGroup param_1,
      android.os.Bundle param_2) {
    java.lang.Object[] args = new java.lang.Object[3];
    args[0] = param_0;
    args[1] = param_1;
    args[2] = param_2;
    return (android.view.View)
        com.tns.Runtime.callJSMethod(this, "onCreateView", android.view.View.class, args);
  }

  public void onDestroy() {
    java.lang.Object[] args = new java.lang.Object[0];
    com.tns.Runtime.callJSMethod(this, "onDestroy", void.class, args);
  }

  public int hashCode__super() {
    return super.hashCode();
  }

  public boolean equals__super(java.lang.Object other) {
    return super.equals(other);
  }
}
