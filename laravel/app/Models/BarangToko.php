<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class BarangToko extends Model
{
    use HasFactory;

    // Not including updated_at and created_at
    public $timestamps = false;
    protected $table = 'barang_toko';

    protected $fillable = [
        'id_barang',
        'id_toko',
    ];
}
