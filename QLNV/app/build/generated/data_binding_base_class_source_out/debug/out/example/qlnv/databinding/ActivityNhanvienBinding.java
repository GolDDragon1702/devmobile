// Generated by view binder compiler. Do not edit!
package example.qlnv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import example.qlnv.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNhanvienBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnClear;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnSua;

  @NonNull
  public final Button btnThem;

  @NonNull
  public final Button btnXoa;

  @NonNull
  public final EditText edtDiaChi;

  @NonNull
  public final EditText edtGhiChu;

  @NonNull
  public final EditText edtGioiTinh;

  @NonNull
  public final EditText edtHoTen;

  @NonNull
  public final EditText edtMaNV;

  @NonNull
  public final EditText edtNgaySinh;

  @NonNull
  public final EditText edtSDT;

  @NonNull
  public final LinearLayout layoutNhanVien;

  @NonNull
  public final ListView lvNhanVien;

  private ActivityNhanvienBinding(@NonNull LinearLayout rootView, @NonNull Button btnClear,
      @NonNull Button btnHome, @NonNull Button btnSua, @NonNull Button btnThem,
      @NonNull Button btnXoa, @NonNull EditText edtDiaChi, @NonNull EditText edtGhiChu,
      @NonNull EditText edtGioiTinh, @NonNull EditText edtHoTen, @NonNull EditText edtMaNV,
      @NonNull EditText edtNgaySinh, @NonNull EditText edtSDT, @NonNull LinearLayout layoutNhanVien,
      @NonNull ListView lvNhanVien) {
    this.rootView = rootView;
    this.btnClear = btnClear;
    this.btnHome = btnHome;
    this.btnSua = btnSua;
    this.btnThem = btnThem;
    this.btnXoa = btnXoa;
    this.edtDiaChi = edtDiaChi;
    this.edtGhiChu = edtGhiChu;
    this.edtGioiTinh = edtGioiTinh;
    this.edtHoTen = edtHoTen;
    this.edtMaNV = edtMaNV;
    this.edtNgaySinh = edtNgaySinh;
    this.edtSDT = edtSDT;
    this.layoutNhanVien = layoutNhanVien;
    this.lvNhanVien = lvNhanVien;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNhanvienBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNhanvienBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_nhanvien, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNhanvienBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnClear;
      Button btnClear = ViewBindings.findChildViewById(rootView, id);
      if (btnClear == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnSua;
      Button btnSua = ViewBindings.findChildViewById(rootView, id);
      if (btnSua == null) {
        break missingId;
      }

      id = R.id.btnThem;
      Button btnThem = ViewBindings.findChildViewById(rootView, id);
      if (btnThem == null) {
        break missingId;
      }

      id = R.id.btnXoa;
      Button btnXoa = ViewBindings.findChildViewById(rootView, id);
      if (btnXoa == null) {
        break missingId;
      }

      id = R.id.edtDiaChi;
      EditText edtDiaChi = ViewBindings.findChildViewById(rootView, id);
      if (edtDiaChi == null) {
        break missingId;
      }

      id = R.id.edtGhiChu;
      EditText edtGhiChu = ViewBindings.findChildViewById(rootView, id);
      if (edtGhiChu == null) {
        break missingId;
      }

      id = R.id.edtGioiTinh;
      EditText edtGioiTinh = ViewBindings.findChildViewById(rootView, id);
      if (edtGioiTinh == null) {
        break missingId;
      }

      id = R.id.edtHoTen;
      EditText edtHoTen = ViewBindings.findChildViewById(rootView, id);
      if (edtHoTen == null) {
        break missingId;
      }

      id = R.id.edtMaNV;
      EditText edtMaNV = ViewBindings.findChildViewById(rootView, id);
      if (edtMaNV == null) {
        break missingId;
      }

      id = R.id.edtNgaySinh;
      EditText edtNgaySinh = ViewBindings.findChildViewById(rootView, id);
      if (edtNgaySinh == null) {
        break missingId;
      }

      id = R.id.edtSDT;
      EditText edtSDT = ViewBindings.findChildViewById(rootView, id);
      if (edtSDT == null) {
        break missingId;
      }

      LinearLayout layoutNhanVien = (LinearLayout) rootView;

      id = R.id.lvNhanVien;
      ListView lvNhanVien = ViewBindings.findChildViewById(rootView, id);
      if (lvNhanVien == null) {
        break missingId;
      }

      return new ActivityNhanvienBinding((LinearLayout) rootView, btnClear, btnHome, btnSua,
          btnThem, btnXoa, edtDiaChi, edtGhiChu, edtGioiTinh, edtHoTen, edtMaNV, edtNgaySinh,
          edtSDT, layoutNhanVien, lvNhanVien);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
