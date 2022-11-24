<?php

namespace App\Http\Controllers;

use App\Models\Barang;
use App\Models\BarangToko;
use App\Models\Toko;
use Illuminate\Http\Request;

class AdminController extends Controller
{
    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function buat_toko(Request $request)
    {
        // Gunakan request untuk mendapatkan data yg diinginkan
        // Disini aku hanya hardcode

        $nama_toko = "Toko laravel";
        $id_admin = 2;

        $toko = new Toko();
        $toko->nama = $nama_toko;
        $toko->id_akun = $id_admin;
        $toko->save();

        ddd($toko);
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function buat_barang(Request $request)
    {
        // Gunakan request untuk mendapatkan data yg diinginkan
        // Disini aku hanya hardcode

        $nama_barang = "Barang laravel";
        $id_admin = 2;

        $barang = new Barang();
        $barang->nama = $nama_barang;
        $barang->id_akun = $id_admin;
        $barang->save();

        ddd($barang);
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function sematkan_barang_toko(Request $request)
    {
        // Gunakan request untuk mendapatkan data yg diinginkan
        // Disini aku hanya hardcode

        $id_toko = 8;
        $id_barang = 4;

        $semat = new BarangToko();
        $semat->id_barang = $id_barang;
        $semat->id_toko = $id_toko;
        $semat->save();

        ddd($semat);

    }

}