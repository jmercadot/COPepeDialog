package com.continuidadoperativa.copepedialog;

public interface COPepeDialogInterface {

    void dismiss();

    public interface OnClickListener {
        void OnClick(COPepeDialogInterface dialog);
    }
}
